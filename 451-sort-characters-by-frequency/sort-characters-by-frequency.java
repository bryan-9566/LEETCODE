class Solution {
    public String frequencySort(String s) {
        String res="";
        Map<Character,Integer> fre=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            fre.put(s.charAt(i),fre.getOrDefault(s.charAt(i),0)+1);
        }
        while(!fre.isEmpty())
        {
            int max=0;
            char c=0;
            for(Map.Entry<Character,Integer> entry:fre.entrySet() )
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                c=entry.getKey();
            }
        }
        for(int i=0;i<max;i++)
        {
            res+=c;;
        }
        fre.remove(c);

        }
        return res;
        



    }
}