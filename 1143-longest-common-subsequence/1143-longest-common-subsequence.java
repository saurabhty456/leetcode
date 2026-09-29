class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[1001][1001];
        int m=text1.length();
        int n=text2.length();
        for(int i=0;i<m;i++)
        {
            dp[i][0]=0;
        }
         for(int j=0;j<n;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    int t=dp[i][j-1];
                    int s=dp[i-1][j];
                    dp[i][j]=Math.max(t,s);
                }
            }
        }
        return dp[m][n];
    }
}