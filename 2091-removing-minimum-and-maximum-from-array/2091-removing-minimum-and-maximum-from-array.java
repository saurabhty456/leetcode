class Solution {
    public int minimumDeletions(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int minIn=map.get(min);
        int maxIn=map.get(max);
        int i=Math.min(minIn,maxIn);
        int j=Math.max(minIn,maxIn);
        int f=j+1;
        int b=n-i;
        int fb=(i+1)+(n-j);
        return Math.min(Math.min(f,b),fb);
    }
}