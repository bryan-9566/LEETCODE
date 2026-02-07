import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> se=new HashSet<>();
        for(int n:nums)
        {
            se.add(n);
        }
        List<Integer> l=new ArrayList<>(se);
        Collections.sort(l,Collections.reverseOrder());
        if(l.size()>=3)
         return l.get(2);
        else
         return l.get(0);

    }
}