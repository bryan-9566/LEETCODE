class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> bry=new HashMap<>();
        for(int i=0;i<text.length();i++)
        {
            bry.put(text.charAt(i),bry.getOrDefault(text.charAt(i),0)+1);
        }
        int b=bry.getOrDefault('b',0);
        int a=bry.getOrDefault('a',0);
        int l=bry.getOrDefault('l',0)/2;
        int o=bry.getOrDefault('o',0)/2;
        int n=bry.getOrDefault('n',0);
        int[] arr={b,a,l,o,n};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}