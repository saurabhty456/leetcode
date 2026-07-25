class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int pref=0;
        for(int i=0;i<n;i++)
        {
            if(i>0)
            {
                pref+=nums[i-1];
            }
             if(pref==(sum-pref-nums[i]))
            {
                return i;
            }
        }
        return -1;
    }
}