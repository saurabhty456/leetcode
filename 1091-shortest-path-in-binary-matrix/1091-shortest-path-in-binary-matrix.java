class Pair
{
    int dist;
    int f;
    int s;
    public Pair(int dist,int f,int s)
    {
        this.dist=dist;
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
       if(grid[0][0]==1||grid[n-1][n-1]==1)
       {
        return -1;
       }
       Queue<Pair>q=new LinkedList<Pair>();
       int path[][]=new int[n][n];
       q.offer(new Pair(1,0,0));
       path[0][0]=1;
       while(!q.isEmpty())
       {
        Pair cur=q.peek();
        q.poll();
        int dist=cur.dist;
        int r=cur.f;
        int c=cur.s;
        if(r==n-1&&c==n-1)
        {
            return dist;
        }
        for(int i=-1;i<=1;i++)
        {
            for(int j=-1;j<=1;j++)
            {
                if(i==0&&j==0)
                {
                    continue;
                }
                int nr=r+i;
                int nc=c+j;
                if(nr>=0&&nr<n&&nc>=0&&nc<n&&grid[nr][nc]==0&&path[nr][nc]==0)
                {
                    path[nr][nc]=1;
                    q.offer(new Pair(dist+1,nr,nc));
                }
            }
        }
       }
       return -1;
    }
}