class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
       int proPre[]= new int[n];
       int proSuf[]=new int[n];
       int ans[]=new int[n];
       proPre[0]=1;
       for(int i=1;i<n;i++)
       {
        proPre[i]=nums[i-1]*proPre[i-1];
       }
        proSuf[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            proSuf[i] = nums[i + 1] * proSuf[i + 1];
        }
       for(int i=0;i<n;i++)
       {
        ans[i]=proPre[i]*proSuf[i];
       }
       return ans;
    }
}