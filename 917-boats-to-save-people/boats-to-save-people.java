class Solution {
    public int numRescueBoats(int[] people, int limit) {
       Arrays.sort(people);
       int l=0,r=people.length-1;
       int b=0;
       while(l<=r)
       {
        if(people[l]+people[r]<=limit)
        {
            l++;
            r--;
        }
        else
        {
            r--;
        }
        b++;
       } 
       return b;
    }
}