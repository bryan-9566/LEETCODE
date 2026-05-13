class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        long sn=(long)n*(n+1)/2;
        long s2n=(long)n*(n+1)*(2*n+1)/6;
        long sa=0,s2a=0;
        for(int i=0;i<nums.length;i++)
        {
            sa+=nums[i];
            s2a+=nums[i]*nums[i];
        }
        long v1=sa-sn;
        long v2=s2a-s2n;
        v2=v2/v1;
        long repeat=(v1+v2)/2;
        long miss=repeat-v1;
        return new int[] {(int)repeat,(int)miss};
    }
}