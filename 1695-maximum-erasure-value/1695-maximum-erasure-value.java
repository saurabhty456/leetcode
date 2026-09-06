class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(j=0;j<nums.length;j++)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            while(map.get(nums[j])>1)
            {
                map.put(nums[i],map.get(nums[i])-1);
                sum-=nums[i];
                i++;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}