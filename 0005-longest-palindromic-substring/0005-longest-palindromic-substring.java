class Solution {
    public String longestPalindrome(String s) {
       boolean dp[][]=new boolean[s.length()][s.length()];
        int maxl=0;
        int idx=0;
        for(int i=0;i<s.length();i++)
        {
            dp[i][i]=true;
            maxl=1;
        }
        for(int l=2;l<=s.length();l++)
        {
            for(int i=0;i<s.length()-l+1;i++)
            {
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j)&&l==2)
                {
                    dp[i][j]=true;
                    maxl=2;
                    idx=i;
                }
                else if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true)
                {
                dp[i][j]=true;
                   if(j-i+1>maxl)
                   {
                    maxl=j-i+1;
                    idx=i;
                   }
                }
                else
                {
                    dp[i][j]=false;
                }
            }
        }
        return s.substring(idx,idx+maxl);
    }
}