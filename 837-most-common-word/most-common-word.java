class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> h=new HashSet<>();
        for(String o:banned)
        {
            h.add(o.toLowerCase());
        }
        HashMap<String,Integer> bry=new HashMap<>();
        String[] hem=paragraph.split("\\W+");
        for(int i=0;i<hem.length;i++)
        {
            String s=hem[i];
            s=s.toLowerCase();
            if(!h.contains(s))
            {
                bry.put(s,bry.getOrDefault(s,0)+1);
            }
        }
        int max=0;
        String ans="";
        for(Map.Entry<String,Integer> e:bry.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                ans=e.getKey();
            }
        }
        return ans;
    }
}