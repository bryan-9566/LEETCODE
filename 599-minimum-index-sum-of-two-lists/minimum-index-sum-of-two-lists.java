class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> hem=new ArrayList<>();
        HashMap<String,Integer> bry=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            bry.put(list1[i],i);
        }
        for(int j=0;j<list2.length;j++)
        {
            if(bry.containsKey(list2[j]))
            {
                int sum=bry.get(list2[j])+j;
                if(sum<min)
                {
                    hem.clear();
                    hem.add(list2[j]);
                    min=sum;
                }
                else if(sum==min)
                {
                    hem.add(list2[j]);
                }
            }
        }
        return hem.toArray(new String[0]);
    }
}