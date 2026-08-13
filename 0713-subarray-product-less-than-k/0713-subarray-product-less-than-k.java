class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        return 0;
      int p=1;
      int i=0;
      int sum=0;
      for(int j=0;j<nums.length;j++)
      {
        p*=nums[j];
        while(p>=k)
        {
            p=p/nums[i];
            i++;
        }
        sum+=(j-i+1);
      }
      return sum;
    }
}