class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int d=0;
        for(int i=1;i<=103;i++)
        {
             d=k*i;
            if(set.contains(d))
            {
                continue;
            }
            else
            {
                break;
            }
        }
        return d;
    }
}