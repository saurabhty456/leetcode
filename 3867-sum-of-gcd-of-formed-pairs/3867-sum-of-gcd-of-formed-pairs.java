class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
      int pGod[]=new int[n];
      int mx=0;
      for(int i=0;i<n;i++)
      {
        mx=Math.max(nums[i],mx);
        pGod[i]=gcd(nums[i],mx);
      }
      Arrays.sort(pGod);
      long sum=0;
      int i=0;
      int j=pGod.length-1;
      while(i<j)
      {
        sum+=gcd(pGod[i],pGod[j]);
        i++;
        j--;
      }
      return sum;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}