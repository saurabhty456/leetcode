class Solution {
    public int[] rearrangeArray(int[] nums) {
       int posi[]=new int[nums.length/2];
       int negat[]=new int[nums.length/2];
       int r[]=new int[nums.length];
       int ni=0;
       int pos=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>=0)
        {
        posi[pos++]=nums[i];
        }
        else
        {
            negat[ni++]=nums[i];
        }
       }
       int p=0;
       int n=0;
       int m=0;
       while(p<posi.length&&n<posi.length)
       {
        r[m++]=posi[p];
        r[m++]=negat[n];
        p++;
        n++;
       }
       return r; 
    }
}