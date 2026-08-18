class Solution {
    public int largestInteger(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int max=-1;
       int max2=0;
       for(int i=0;i<nums.length;i++)
       {
        if(map.get(nums[i])==1)
        {
            max=Math.max(max,nums[i]);
        }
        max2=Math.max(max2,nums[i]);
       }
       if(k>1&&k<nums.length)
       {
        int v1=map.get(nums[0]);
        int v2=map.get(nums[nums.length-1]);
        if(v1>1&&v2>1)
        {
            return -1;
        }
        else if(v1==1&&v2>1)
        {
            return nums[0];
        }
        else if(v2==1&&v1>1)
        {
            return nums[nums.length-1];
        }
        else
        {
            return Math.max(nums[nums.length-1],nums[0]);
        }
       }
       if(k==1)
       {
        return max;
       }
       return max2;
    }
}