class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int d=('z'-c+1)*(i+1);
            sum+=d;
        }
        return sum;
    }
}