class Solution {
    public int maxDepth(String s) {
        int d=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                max+=1;
            }
            else if(c==')')
            {
                max-=1;
            }
            d=Math.max(max,d);
        }
        return d;
    }
}