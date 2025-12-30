class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] arr1=new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            String temp=arr[i];
            int len=temp.length();
            int ind=temp.charAt(len-1)-'0';
            arr1[ind-1]=temp.substring(0,len-1);
        }
        return String.join(" ",arr1);
    }
}