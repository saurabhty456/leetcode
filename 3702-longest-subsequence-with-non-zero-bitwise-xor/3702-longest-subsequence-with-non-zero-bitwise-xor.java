class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int txor=0;
        boolean d=false;
        for(int num:nums)
        {
            txor^=num;
            if(num>0)
            {
                d=true;
            }
        }
        if(txor!=0)
        {
            return n;
        }
        if(!d)
        {
            return 0;
        }
        return n-1;
    }
}