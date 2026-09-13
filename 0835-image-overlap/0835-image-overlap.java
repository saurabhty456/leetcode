class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
       int n=img1.length;
       int freq[][]=new int[2*n-1][2*n-1];
       List<int[]>one1=new ArrayList<>();
       List<int[]>one2=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(img1[i][j]==1)
            {
                one1.add(new int[]{i,j});
            }
            if(img2[i][j]==1)
            {
                one2.add(new int[]{i,j});
            }
        }
       }
       int ans=0;
       for(int[]p1:one1)
       {
        for(int[]p2:one2)
        {
            int dx=p2[0]-p1[0];
            int dy=p2[1]-p1[1];

            int x=dx+n-1;
            int y=dy+n-1;
            freq[x][y]++;
            ans=Math.max(ans,freq[x][y]);
        }
       }
       return ans;
    }
}