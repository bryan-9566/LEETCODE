class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
         int ans = Integer.MAX_VALUE;
        int minLandFinish = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            minLandFinish = Math.min(minLandFinish,
                    landStartTime[i] + landDuration[i]);
        }

        for (int j = 0; j < waterStartTime.length; j++) {

            int waterStart = Math.max(minLandFinish,
                    waterStartTime[j]);

            int finish = waterStart + waterDuration[j];

            ans = Math.min(ans, finish);
        }
        int minWaterFinish = Integer.MAX_VALUE;

        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterFinish = Math.min(minWaterFinish,
                    waterStartTime[i] + waterDuration[i]);
        }

        for (int j = 0; j < landStartTime.length; j++) {

            int landStart = Math.max(minWaterFinish,
                    landStartTime[j]);

            int finish = landStart + landDuration[j];

            ans = Math.min(ans, finish);
        }

        return ans;
    }
}