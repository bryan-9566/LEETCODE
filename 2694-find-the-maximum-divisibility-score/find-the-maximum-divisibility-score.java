class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxcnt=Integer.MIN_VALUE,maxn=0;
        for(int i=0;i<divisors.length;i++)
        {
            int cnt=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                    cnt++;
                }
            }
            if(cnt>maxcnt)
            {
                maxcnt=cnt;
                maxn=divisors[i];
            }
            else if(cnt==maxcnt && maxn>divisors[i])
            {
                maxcnt=cnt;
                maxn=divisors[i];
            }
        }
        return maxn;
    }
}