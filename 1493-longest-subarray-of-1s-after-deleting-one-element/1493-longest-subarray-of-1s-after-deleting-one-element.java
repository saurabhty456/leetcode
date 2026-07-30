class Solution {
    public int longestSubarray(int[] nums) {
        int c=0;
        int i=0;
        int j=0;
        int max=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                c++;
            }
            if(c==1)
            {
                max=Math.max(max,j-i);
            }
            if(c>1)
            {
                if(nums[i]==0)
                {
                    c--;
                }
                i++;
            }
            j++;
        }
        if(c==0)
        {
            return nums.length-1;
        }
        return max;
    }
}