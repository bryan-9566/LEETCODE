class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> bry=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String temp=strs[i];
            char[] a=temp.toCharArray();
            Arrays.sort(a);
            String b=new String(a);
            if(!bry.containsKey(b))
            {
                bry.put(b,new ArrayList<>());
            }
            bry.get(b).add(temp);
        }
        return new ArrayList<>(bry.values());
    }
}