class Solution {
    public String defangIPaddr(String address) {
        ArrayList<Character> list=new ArrayList<>();
        for(char c:address.toCharArray())
        {
            list.add(c);
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)=='.')
            {
                list.set(i,'[');
                list.add(i+1,'.');
                list.add(i+2,']');
                i+=2;
            }
        }
        String result="";
        for(char c:list)
        {
            result+=c;
        }
        return result;
    }
}