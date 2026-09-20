class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []t=new int[n+1];
        java.util.Arrays.fill(t,1);
        int maxl=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    t[i]=Math.max(t[j]+1,t[i]);
                    maxl=Math.max(t[i],maxl);
                }
            }
        }
        return maxl;
    }
}