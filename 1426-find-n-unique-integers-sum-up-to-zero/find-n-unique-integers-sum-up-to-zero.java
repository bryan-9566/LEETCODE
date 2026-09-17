class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n%2!=0)
        {
            int el=1;
            arr[0]=0;
            for(int i=1;i<n;i+=2)
            {
                arr[i]=el;
                arr[i+1]=el*-1;
                el++;
            }
        }
        else
        {
            int el=1;
            for(int i=0;i<n;i+=2)
            {
                arr[i]=el;
                arr[i+1]=el*-1;
                el++;
            }
        }
        return arr;
    }
}