class Solution {
    public int findMin(int[] nums) {
     int low=0,high=nums.length-1;
     int ans=Integer.MAX_VALUE;
     while(low<=high)
     {
        int mid=low+(high-low)/2;
        if(nums[low]==nums[mid] && nums[mid]==nums[high])
        {
            if(nums[low]<ans)
            {
                ans=nums[low];
            }
            low++;
            high--;
            continue;
        }
        if(nums[low]<=nums[mid])
        {
            if(ans>nums[low])
            {
                ans=nums[low];
            }
            low=mid+1;
        }
        else
        {
            if(nums[mid]<ans)
            {
                ans=nums[mid];
            }
            high=mid-1;
        }
     } 
     return ans;  
    }
}