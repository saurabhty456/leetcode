class Solution {
    public int maxArea(int[] h) {
       int i=0;
       int j=h.length-1;
       int max=Integer.MIN_VALUE;
       while(i<j)
       {
        int a=Math.min(h[i],h[j])*(j-i);
        max=Math.max(max,a);
        if(h[i]<h[j])
        {
            i++;
        }
        else
        {
            j--;
        }
       }
       return max; 
    }
}