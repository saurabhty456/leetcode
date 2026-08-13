class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int l=1;
        int h=max;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            int sum=0;
            for(int num:nums)
            {
                sum+=(int)Math.ceil((double)num/mid);
            }
            if(sum<=threshold)
            {
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}