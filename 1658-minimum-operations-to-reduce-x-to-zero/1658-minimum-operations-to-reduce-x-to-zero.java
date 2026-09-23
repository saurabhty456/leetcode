class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        int t=sum-x;
        if(t<0)
        return -1;

        if(t==0)
        return nums.length;

        int left=0;
        int cs=0;
        int maxl=-1;
        for(int r=0;r<nums.length;r++)
        {
            cs+=nums[r];
            while(cs>t&&left<=r)
            {
                cs-=nums[left];
                left++;
            }
            if(cs==t)
            {
                maxl=Math.max(maxl,r-left+1);
            }
        }
        return maxl==-1?-1:nums.length-maxl;
    }
}