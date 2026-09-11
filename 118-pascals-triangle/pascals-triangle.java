class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> bh=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            bh.add(generaterow(i));
        }
        return bh;
    }
    public List<Integer> generaterow(int r)
    {
        List<Integer> b=new ArrayList<>();
        long ans=1;
        b.add((int)ans);
        for(int i=1;i<r;i++)
        {
            ans=ans*(r-i);
            ans=ans/i;
            b.add((int)ans);
        }
        return b;
    }
}