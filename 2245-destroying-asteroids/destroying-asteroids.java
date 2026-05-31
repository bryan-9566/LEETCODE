class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
       Arrays.sort(asteroids);
       long b=mass;
       for(int i=0;i<asteroids.length;i++)
       {
        if(asteroids[i]>b)
        {
            return false;
        }
        b+=asteroids[i];
       }
       return true;
    }
}