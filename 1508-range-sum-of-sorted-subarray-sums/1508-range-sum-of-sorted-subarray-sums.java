// class Solution {
//     public int rangeSum(int[] nums, int n, int left, int right) {
//         int w=0;
//        int sum[]=new int[n*(n+1)/2];
//        for(int i=0;i<n;i++)
//        {
//         for(int j=i;j<n;j++)
//         {
//             int s=findS(i,j,nums);
//             sum[w++]=s;
//         }
//        }
//        Arrays.sort(sum);
//        int totals=0;
//        for(int j=left-1;j<right;j++)
//        {
//         totals+=sum[j];
//        }
//        return totals%(1000000007); 
//     }
//     public int findS(int l,int r,int []nums)
//     {
//         int ns=0;
//         for(int i=l;i<=r;i++)
//         {
//             ns+=nums[i];
//         }
//         return ns;
//     }
// } //TLE
class Solution {
    int w=0;
    public int rangeSum(int[] nums, int n, int left, int right) {
      int sum[]=new int[n*(n+1)/2];
      for(int s=0;s<n;s++)
      {
        solve(s,sum,nums,0);
      }
      Arrays.sort(sum);
      long totals=0;
      for(int j=left-1;j<right;j++)
      {
        totals=(totals+sum[j])%1000000007;
      }
      return (int)totals; 
    }
    public void solve(int e,int[]sum,int []nums,int s)
    {
        if(e==nums.length)
        return;

        s+=nums[e];
        sum[w++]=s;
        solve(e+1,sum,nums,s);
    }
}