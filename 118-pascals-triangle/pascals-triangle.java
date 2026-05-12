class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> bry=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            bry.add(rows(i));
        }
        return bry;
    }
    public List<Integer> rows(int row)
    {
        List<Integer> hem=new ArrayList<>();
        long ans=1;
        hem.add((int)ans);
        for(int i=1;i<row;i++)
        {
            ans=ans*(row-i);
            ans=ans/i;
            hem.add((int)ans);
        }
        return hem;
    }
}