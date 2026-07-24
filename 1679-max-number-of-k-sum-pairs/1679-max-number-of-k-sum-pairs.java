class Solution {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
       int c=0;
       int n=nums.length;
       int i=0;
       int j=n-1;
       while(i<j)
       {
        if(nums[i]+nums[j]==k)
        {
            c++;
            i++;
            j--;
        }
        else if(nums[i]+nums[j]>k)
        {
            j--;
        }
        else
        {
            i++;
        }
       }
       return c; 
    }
}