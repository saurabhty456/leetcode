class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
       int prefix[]=new int[n];
       java.util.Arrays.fill(prefix,Integer.MAX_VALUE);
       int maxsum=0;
       int left=0;
       int m=Integer.MAX_VALUE;
       for(int r=0;r<n;r++)
       {
        maxsum+=arr[r];
        while(maxsum>target&&left<=r)
        {
            maxsum-=arr[left];
            left++;
        }
        if(maxsum==target)
        {
            int l=r-left+1;
            if(left>0&&prefix[left-1]!=Integer.MAX_VALUE)
            {
                m=Math.min(m,l+prefix[left-1]);
            }

            if(r>0)
            {
                prefix[r]=Math.min(prefix[r-1],l);
            }
            else
            {
                prefix[r]=l;
            }
        }
        else
        {
            if(r>0)
            {
                prefix[r]=prefix[r-1];
            }
        }
       }
       return m==Integer.MAX_VALUE?-1:m;
    }
}