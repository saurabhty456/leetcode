
class Solution {
    public int firstStableIndex(int[] nums, int k) {
     int max[]=new int[nums.length];
     int min[]=new int[nums.length];
     max[0]=nums[0];
     min[nums.length-1]=nums[nums.length-1];
     for(int i=1;i<nums.length;i++)
     {
        max[i]=Math.max(nums[i],max[i-1]);
     }
     for(int i=nums.length-2;i>=0;i--)
     {
        min[i]=Math.min(nums[i],min[i+1]);
     }
     int j;
     for(j=0;j<max.length;j++)
     {
        int stab=max[j]-min[j];
        if(stab<=k)
        {
            return j;
        }
     }
     return -1;
    }
}