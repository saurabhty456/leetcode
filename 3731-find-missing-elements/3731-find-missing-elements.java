class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int s=nums[0];
        int e=nums[nums.length-1];
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        while(s!=e)
        {
            if(!set.contains(s))
            list.add(s);

            s++;
        }
        return list;
    }
}