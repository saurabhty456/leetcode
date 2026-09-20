class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        Arrays.sort(pairs,(a,b)->Integer.compare(a[0],b[0]));
        int []t=new int[n+1];
        java.util.Arrays.fill(t,1);
        int maxl=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(pairs[i][0]>pairs[j][1])
                {
                    t[i]=Math.max(t[j]+1,t[i]);
                    maxl=Math.max(t[i],maxl);
                }
            }
        }
        return maxl;
    }
}