class Solution {
    public String frequencySort(String s) {
        StringBuilder bry=new StringBuilder();
        HashMap<Character,Integer> bh=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            bh.put(s.charAt(i),bh.getOrDefault(s.charAt(i),0)+1);
        }
        while(!bh.isEmpty())
        {
            int max=0;
            char c=' ';
            for(Map.Entry<Character,Integer> h:bh.entrySet())
            {
                if(h.getValue()>max)
                {
                    max=h.getValue();
                    c=h.getKey();
                }
            }
            for(int i=0;i<max;i++)
            {
                bry.append(c);
            }
            bh.remove(c);
        }
        return new String(bry);
    }
}