class Solution {
    public String reverseParentheses(String s) {
        String c="";
        Stack<String> q=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char w=s.charAt(i);
           if(w=='(')
           {
            q.push(c);
            c="";
           }
           else if(w==')')
           {
            c=q.pop()+new StringBuilder(c).reverse().toString();
           }
           else
           {
            c+=w;
           }
        }
        return c;
    }
}