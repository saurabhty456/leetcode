class Solution {
    public int maxProduct(int[] nums) {
       int f=Integer.MIN_VALUE;
       int s=Integer.MIN_VALUE;
       for(int num:nums)
       {
        if(num>=f)
        {
            s=f;
            f=num;
        }
        else if(num>=s)
        {
            s=num;
        }
       }
       return (f-1)*(s-1);
    }
}