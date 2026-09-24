class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sum=solve(nums[i]);
            if(i==sum)
            {
                return i;
            }
        }
        return -1;
    }
    public int solve(int d)
    {
        int s=0;
        while(d>0)
        {
            int r=d%10;
            s+=r;
            d=d/10;
        }
        return s;
    }
}