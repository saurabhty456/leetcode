// class Solution {
//     public int minDistance(String word1, String word2) {
//         return solve(word1,word2,0,0);
//     }
//     public int solve(String word1,String word2,int i,int j)
//     {
//         if(j==word2.length())
//         return word1.length()-i;

//         if(i==word1.length())
//         return word2.length()-j;

//         if(word1.charAt(i)==word2.charAt(j))
//         {
//             return solve(word1,word2,i+1,j+1);
//         }
//         int insert=1+solve(word1,word2,i,j+1);
//         int delete=1+solve(word1,word2,i+1,j);
//         int r=1+solve(word1,word2,i+1,j+1);

//         return Math.min(Math.min(insert,delete),r);
//     }
// }
 class Solution {
     public int minDistance(String word1, String word2) {
        int dp[][]=new int[501][501];
        int m=word1.length();
        int n=word2.length();
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=i+j;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
     }
 }