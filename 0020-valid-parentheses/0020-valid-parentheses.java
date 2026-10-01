class Solution {
    public boolean isValid(String s) {
        Stack<Character>f=new Stack<>();
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
        if(c=='('||c=='{'||c=='[')
        {
            f.push(c);
        }
        else
        {
        if(c==')')
        {
        if(f.isEmpty()||f.pop()!='(')
        {
            return false;
        }
        }
        if(c==']')
        {
        if(f.isEmpty()||f.pop()!='[')
        {
            return false;
        }
        }
        if(c=='}')
        {
        if(f.isEmpty()||f.pop()!='{')
        {
            return false;
        }
        }
       }
       }
        return f.isEmpty();
    }
}