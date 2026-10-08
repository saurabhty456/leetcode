class Solution {
    public String removeOuterParentheses(String s) {
       int open=0;
       StringBuilder r=new StringBuilder();
       int w=0;
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
        if(c=='(')
        {
            open++;
        }
        else
        {
            open--;
            if(open==0)
            {
                r.append(s.substring(w+1,i));
                w=i+1;
            }
        }
       }
       return r.toString(); 
    }
}