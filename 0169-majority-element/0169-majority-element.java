class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            int v=map.get(nums[i]);
            if(v>n)
            {
                return nums[i];
            }
        }
        return 0;
    }
}