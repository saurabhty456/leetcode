class Solution {
    public int minInsertions(String s) {
        int need=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                need+=2;
                if(need%2==1)
                {
                    ans++;
                    need--;
                }
            }
            else
            {
               need--;
               if(need<0)
               {
                ans++;
                need=1;
               }
            }
        }
        return ans+need;
    }
}