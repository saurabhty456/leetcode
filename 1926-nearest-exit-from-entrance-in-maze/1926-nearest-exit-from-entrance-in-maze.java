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
    public int nearestExit(char[][] maze, int[] e) {
        Queue<Pair>q=new LinkedList<>();
        int m=maze.length;
        int n=maze[0].length;
        q.add(new Pair(e[0],e[1]));
        boolean visit[][]=new boolean[m][n];
        int r[]={-1,0,1,0};
        int c[]={0,1,0,-1};
        visit[e[0]][e[1]]=true;
        int step=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int k=0;k<s;k++)
            {
            Pair co=q.peek();
            q.poll();
            int row=co.f;
            int cow=co.s;
            if((row==0||row==m-1||cow==0||cow==n-1)&&step!=0)
            {
                return step;
            }
            for(int i=0;i<4;i++)
            {
                int nr=row+r[i];
                int nc=cow+c[i];
                if(nr>=0&&nr<=m-1&&nc>=0&&nc<=n-1&&maze[nr][nc]=='.'&&visit[nr][nc]==false)
                {
                    q.add(new Pair(nr,nc));
                    visit[nr][nc]=true;
                }
            }
        }
        step++;
        }
        return -1;
    }
}