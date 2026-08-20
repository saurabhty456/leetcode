class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(list.get((list.size()-1))>list2.get((list2.size()-1)))
            {
                list.add(nums[i]);
            }
            else
            {
                list2.add(nums[i]);
            }
        }
         int[] r = new int[nums.length];
        int index = 0;
        
        for (int val : list) {
            r[index++] = val;
        }
        for (int val : list2) {
            r[index++] = val;
        }
        
        return r;
    }
}