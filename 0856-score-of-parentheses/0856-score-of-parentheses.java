class Solution {
    public int scoreOfParentheses(String s) {
        int open=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            open++;
            else
            {
               open--;
               if(s.charAt(i-1)=='(')
               {
                max+=(int)Math.pow(2,open);
               }
            }
        }
        return max;
    }
}