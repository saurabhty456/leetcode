class Pair
{
    int d;
    int f;
    int s;
    public Pair(int d,int f,int s)
    {
        this.d=d;
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int minimumObstacles(int[][] grid) {
        PriorityQueue<Pair> q = new PriorityQueue<>(
            (x, y) -> Integer.compare(x.d, y.d)
        );
        q.add(new Pair(0,0,0));
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        int m=grid.length;
        int n=grid[0].length;
        int dist[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        while(!q.isEmpty())
        {
            Pair cu=q.poll();
            int cost=cu.d;
            int r=cu.f;
            int c=cu.s;
            if(cost>dist[r][c])
            {
                continue;
            }
            if(r==m-1&&c==n-1)
            {
                return cost;
            }
            for(int i=0;i<4;i++)
            {
                int nr=r+row[i];
                int nc=c+col[i];
               if (nr >= 0 && nr < m && nc >= 0 && nc < n) {

                    int newCost = cost + grid[nr][nc];

                    if (newCost < dist[nr][nc]) {
                        dist[nr][nc] = newCost;
                        q.add(new Pair(newCost, nr, nc));
                    }
                }
            }
        }
        return 0;
    }
}