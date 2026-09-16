class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n-1;i++)
        {
            int s=nums[i-1]+ ((i-2>=0)?dp[i-2]:0);
            int skip=dp[i-1];
            dp[i]=Math.max(s,skip);
        }
        int r1=dp[n-1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=0;
        }
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++)
        {
            int s=nums[i-1]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(s,skip);
        }
        return Math.max(dp[n],r1);
    }
}