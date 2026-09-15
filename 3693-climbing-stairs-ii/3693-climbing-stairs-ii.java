class Solution {
    public int climbStairs(int n, int[] cost) {
        int dp[]=new int[n+1];
        dp[0]=0;
        if(n>=1)
        dp[1]=cost[0]+1;

        if(n>=2)
        dp[2]=Math.min(cost[1]+4,dp[1]+cost[1]+1);
        
        for(int i=3;i<=n;i++)
        {
            int one=dp[i-1]+cost[i-1]+1;
            int s=dp[i-2]+cost[i-1]+4;
            int t=dp[i-3]+cost[i-1]+9;
            dp[i]=Math.min(one,Math.min(s,t));
        }
        return dp[n];
    }
}