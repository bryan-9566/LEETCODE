/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int s=0;
        int e=n-1;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            int val=mountainArr.get(mid);
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }
        int peak=s;
        int fir=bin(mountainArr,target,0,peak);
        if(fir!=-1)
        {
            return fir;
        }
        return bin(mountainArr,target,peak+1,n-1);
    }
    public int bin(MountainArray a,int t,int s,int e)
    {
        boolean check=a.get(s)<a.get(e);
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int val=a.get(mid);
            if(val==t)
             return mid;
            if(check)
            {
                if(val>t)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else
            {
                if(val>t)
                {
                    s=mid+1;
                }
                else
                {
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}