class Solution {
    private char[] digits;
    private Result[][][][] memo;

    public long totalWaviness(long num1, long num2) {
        return calculate(num2) - calculate(num1 - 1);
    }

    private long calculate(long n) {
        if (n <= 0) return 0;

        digits = Long.toString(n).toCharArray();
        int len = digits.length;

        memo = new Result[len + 1][3][11][11];

        return dfs(0, true, 0, 10, 10).waviness;
    }

    private Result dfs(int pos, boolean tight, int state, int prev2, int prev1) {
        if (pos == digits.length) {
            return new Result(1L, 0L);
        }

        if (!tight && memo[pos][state][prev2][prev1] != null) {
            return memo[pos][state][prev2][prev1];
        }

        int limit = tight ? digits[pos] - '0' : 9;

        long count = 0;
        long waviness = 0;

        for (int digit = 0; digit <= limit; digit++) {
            boolean nextTight = tight && (digit == limit);

            if (state == 0) {
                if (digit == 0) {
                    Result next = dfs(pos + 1, nextTight, 0, 10, 10);
                    count += next.count;
                    waviness += next.waviness;
                } else {
                    Result next = dfs(pos + 1, nextTight, 1, 10, digit);
                    count += next.count;
                    waviness += next.waviness;
                }
            } else if (state == 1) {
                Result next = dfs(pos + 1, nextTight, 2, prev1, digit);
                count += next.count;
                waviness += next.waviness;
            } else {
                int contribution = 0;

                if ((prev1 > prev2 && prev1 > digit) ||
                    (prev1 < prev2 && prev1 < digit)) {
                    contribution = 1;
                }

                Result next = dfs(pos + 1, nextTight, 2, prev1, digit);

                count += next.count;
                waviness += next.waviness + (long) contribution * next.count;
            }
        }

        Result result = new Result(count, waviness);

        if (!tight) {
            memo[pos][state][prev2][prev1] = result;
        }

        return result;
    }

    private static class Result {
        long count;
        long waviness;

        Result(long count, long waviness) {
            this.count = count;
            this.waviness = waviness;
        }
    }
}