class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int sum=0;
       int c=Integer.MAX_VALUE;
       int i=0;
       for(int j=0;j<nums.length;j++)
       {
        sum+=nums[j];
        while(sum>=target)
        {
            c=Math.min(c,(j-i+1));
            sum-=nums[i];
            i++;
        }
       }
       if(c==Integer.MAX_VALUE)
       {
        return 0;
       }
       return c;
    }
}