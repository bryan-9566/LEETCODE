class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
        {
            return true;
        }
        for(int i=1;i<s.length();i++)
        {
            char[] bry=s.toCharArray();
            reverse(bry,0,bry.length-1);
            reverse(bry,0,i-1);
            reverse(bry,i,bry.length-1);
            if(new String(bry).equals(goal))
            {
                return true;
            }
        }
        return false;

    }
    public void reverse(char[] nums,int i,int j)
    {
        while(i<j)
        {
            char temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}