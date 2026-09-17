class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> bry=new HashMap<>();
        for(int i:arr)
        {
            bry.put(i,bry.getOrDefault(i,0)+1);
        }
        int cnt=arr.length/4;
        for(Map.Entry<Integer,Integer> h:bry.entrySet())
        {
            if(h.getValue()>cnt)
            {
                return h.getKey();
            }
        }
        return -1;
    }
}