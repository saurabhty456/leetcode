class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                list.add(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        Collections.sort(list);
        return list;
    }
}