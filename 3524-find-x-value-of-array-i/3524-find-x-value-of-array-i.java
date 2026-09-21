// class Solution {
//     public long[] resultArray(int[] nums, int k) {
//      long r[]=new long[nums.length];
//      for(int s=0;s<nums.length;s++)
//      {
//         solve(s,nums,k,r,1);
//      }
//      return r;
//     }
//     public void solve(int end,int nums,int k,long[]r,long p)
//     {
//         if(end==nums.length)
//         return;

//         p*=nums[end];
//         r[(int)p%k];
//         solve(end+1,nums,k,r,p);
//     }
// }
class Solution {
    public long[] resultArray(int[] nums, int k) {
       long dp[]=new long[k];
       long ans[]=new long[k];
       for(int num:nums)
       {
        long newdp[]=new long[k];
        int currem=num%k;
        newdp[currem]++;
        for(int r=0;r<k;r++)
        {
            if(dp[r]==0)
            continue;

            int newr=(int)((long)r*num%k);
            newdp[newr]+=dp[r];
        }
        for(int r=0;r<k;r++)
        {
            ans[r]+=newdp[r];
        }
        dp=newdp;
       }
       return ans;
    }
}