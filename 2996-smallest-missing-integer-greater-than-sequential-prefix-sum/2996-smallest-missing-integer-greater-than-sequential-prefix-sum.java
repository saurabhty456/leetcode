class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                sum+=nums[i];
            }
            else
            {
                break;
            }
        }
        for(int j=sum;j<=3000;j++)
        {
            if(!set.contains(j))
            {
                sum=j;
                break;
            }
        }
        return sum;
    }
}