class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> sw=new ArrayList<>();
        String[] s=new String[n];
        int index=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                s[index++]="FizzBuzz";
            }
            else if(i%3==0)
            {
                s[index++]="Fizz";
            }
            else if(i%5==0)
            {
                s[index++]="Buzz";
            }
            else
            {
                s[index++]=String.valueOf(i);
            }
        }
        for(int i=0;i<n;i++)
        {
            sw.add(s[i]);
        }
        return sw;
    }
}