class Solution {
    public double angleClock(int hour, int minutes) {
        int mhand=minutes*6;
        double hhand=hour*30+minutes*0.5;
        double angle=Math.abs(hhand-mhand);
        double small=Math.min(angle,360-angle);
        return small;


        
    }
}