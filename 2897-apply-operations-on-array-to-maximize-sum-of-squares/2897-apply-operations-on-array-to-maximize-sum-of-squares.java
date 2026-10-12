class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int count[]=new int[32];
        for(int num:nums)
        {
            for(int b=0;b<32;b++)
            {
                if((num &(1<<b))!=0)
                {
                    count[b]++;
                }
            }
        }
        long r=0;
        long mod=1000000007;
        while(k-->0)
        {
            long cur=0;
            for(int b=0;b<32;b++)
            {
                if(count[b]>0)
                {
                    cur=cur|(1<<b);
                    count[b]--;
                }
            }
            r=(r+(cur*cur)%mod)%mod;
        }
        return (int)r;
    }
}