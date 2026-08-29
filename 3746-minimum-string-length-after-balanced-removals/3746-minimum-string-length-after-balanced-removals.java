class Solution {
    public int minLengthAfterRemovals(String s) {
        int c_a=0;
        int c_b=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                c_a++;
            }
            else
            {
                c_b++;
            }
        }
        return Math.abs(c_a-c_b);
    }
}