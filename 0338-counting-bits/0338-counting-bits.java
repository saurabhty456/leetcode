class Solution {
    public int[] countBits(int n) {
      int ans[]=new int[n+1];
      for(int i=0;i<=n;i++)
      {
        int c=ones(i);
        ans[i]=c;
      }
      return ans;  
    }
    public int ones(int no)
    {
        int count=0;
        while(no!=0)
        {
            if((no&1)==1)
            {
                count++;
            }
            no=no>>1;
        }
        return count;
    }
}