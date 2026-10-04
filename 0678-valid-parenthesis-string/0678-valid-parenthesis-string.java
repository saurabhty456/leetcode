class Solution {
    public boolean checkValidString(String s) {
        int star=0;
        int open=0;
        int maxopen=0;
        if(s.charAt(0)==')')
        return false;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                open++;
                maxopen++;
            }
            else if(c==')')
            {
               open--;
               maxopen--;
            }
            else
            {
                open--;
                maxopen++;
            }

            if(maxopen<0)
            return false;

            if(open<0)
            open=0;
        }
       return open==0;
    }
}