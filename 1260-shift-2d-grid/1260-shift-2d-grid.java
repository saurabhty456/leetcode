class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        k=k%(m*n);
        while(k>0)
        {
            int g[][]=new int[m][n];
           for(int i=0;i<m;i++)
           {
            for(int j=0;j<n;j++)
            {
           if(j==n-1)
           {
            g[(i+1)%m][0]=grid[i][j];
           }
           else
           {
            g[i][j+1]=grid[i][j];
           }
            }
           }
           grid=g;
            k--;
        }
        List<List<Integer>>list=new ArrayList<>();
        for(int[]row:grid)
        {
            list.add(new ArrayList<>());
            for(int v:row)
            {
                list.get(list.size()-1).add(v);
            }
        }
        return list;
    }
}