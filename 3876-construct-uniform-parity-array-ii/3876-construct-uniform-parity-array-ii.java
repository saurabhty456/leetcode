class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int e=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
                e=Math.min(e,nums1[i]);
            }
        }
        if(even==nums1.length||odd==nums1.length)
        {
            return true;
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0)
            {
                if(nums1[i]-e<1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}