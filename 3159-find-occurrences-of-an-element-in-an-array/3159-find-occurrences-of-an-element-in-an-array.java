class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
        int ans[]=new int [q.length];
        Map<Integer,Integer>map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                c++;
                map.put(c,i);
            }
        }
        for(int i=0;i<q.length;i++)
        {
            int occ=q[i];
            ans[i]=map.getOrDefault(occ,-1);
        }
        return ans;
    }
}