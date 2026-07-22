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
    public boolean canReach(int[] s, int[] t) {
     boolean visit[][][]=new boolean [8][8][2];
     int x=s[0];
     int y=s[1];
     int x1=t[0];
     int y1=t[1];
     if(x==x1&&y==y1)
     {
        return true;
     }
     Queue<Pair>q=new LinkedList<>();
     q.add(new Pair(x,y));
     int c=0;
     int row[] = {-2, -2, -1, -1, 1, 1, 2, 2};
     int col[] = {-1,  1, -2,  2,-2, 2,-1, 1};
      visit[x][y][0]=true;
     while(!q.isEmpty())
     {
        int r=q.size();
        for(int k=0;k<r;k++)
        {
        Pair cur=q.peek();
        q.poll();
        int sx=cur.f;
        int sy=cur.s;
        if((sx==x1&&sy==y1)&&(c!=0&&c%2==0))
        {
            return true;
        }
         int nextParity = (c + 1) % 2;
        for(int i=0;i<8;i++)
        {
            int newx=sx+row[i];
            int newy=sy+col[i];
            if(newx>=0&&newx<8&&newy>=0&&newy<8&&visit[newx][newy][nextParity]==false)
            {
                visit[newx][newy][nextParity]=true;
                q.add(new Pair(newx,newy));
            }
        }
        }
        c++;
     }
     return false;
    }
}