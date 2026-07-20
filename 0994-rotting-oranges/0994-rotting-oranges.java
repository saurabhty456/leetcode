class Pair
{
    int f;
    int s;
    public Pair(int f,int s)
    {
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair>q=new LinkedList<>();
        int c=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j));
                }
                if(grid[i][j]==1)
                {
                    c++;
                }
            }
        }
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        int t=0;
        int root=0;
        if(c==0)
        {
            return 0;
        }
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                Pair cur=q.peek();
            q.poll();
            int r=cur.f;
            int co=cur.s;
                for(int k=0;k<4;k++)
                {
                    int nr=r+row[k];
                    int nc=co+col[k];
                    if(nr>=0&&nr<m&&nc>=0&&nc<n&&grid[nr][nc]==1)
                    {
                        grid[nr][nc]=2;
                        root++;
                        q.add(new Pair(nr,nc));
                    }
                }
            }
            t++;
        }
        if(root!=c)
        return -1;

        return t-1;
    }
}