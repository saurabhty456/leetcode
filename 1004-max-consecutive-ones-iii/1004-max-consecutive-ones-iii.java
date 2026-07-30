class Solution {
    public int longestOnes(int[] nums, int k) {
       int max=0;
       int i=0;
       int j=0;
       int c=0;
       while(j<nums.length)
       {
        if(nums[j]==0)
        {
            c++;
        }
        if(c<=k)
        {
            max=Math.max(max,j-i+1);
        }
        if(c>k)
        {
            if(nums[i]==0)
            {
                c--;
            }
            i++;
        }
        j++;
       }
       return max; 
    }
}