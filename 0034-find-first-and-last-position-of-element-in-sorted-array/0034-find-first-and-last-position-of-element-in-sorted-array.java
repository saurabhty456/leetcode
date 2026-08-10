class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        a[0]=binaryf(nums,target);
        a[1]=binarys(nums,target);
        return a; 
    }
    public int binaryf(int nums[],int t)
    {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==t)
            {
                ans=mid;
                r=mid-1;
            }
            else if(nums[mid]>t)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
    public int binarys(int nums[],int t)
    {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==t)
            {
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]>t)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}