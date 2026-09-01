class Pair
{
    int r;
    int c;
    int e;
    int mask;
    public Pair(int r,int c,int e,int mask)
    {
        this.r=r;
        this.c=c;
        this.e=e;
        this.mask=mask;
    }
}
class Solution {
    public int minMoves(String[] cl, int energy) {
       int m=cl.length;
       int n=cl[0].length();
       char c[][]=new char[m][n];
       int l=0;
       int x=0;
       int y=0;
       int e=energy;
       for(int i=0;i<m;i++)
       {
        String a=cl[i];
        for(int j=0;j<a.length();j++)
        {
            c[i][j]=a.charAt(j);
            if(a.charAt(j)=='L')
            {
                l++;
            }
            if(a.charAt(j)=='S')
            {
                x=i;
                y=j;
            }
        }
       }
       if(l==0)
       {
        return 0;
       }
       int allcollect=(1<<l)-1;
       Queue<Pair>q=new LinkedList<>();
       int maxe=energy;
       q.add(new Pair(x,y,energy,0));
       int littmask[][]=new int[m][n];
       int id=0;
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(c[i][j]=='L')
            {
                littmask[i][j]=id++;
            }
        }
       }
       int row[]={-1,0,1,0};
       int col[]={0,1,0,-1};
       boolean v[][][][]=new boolean[m][n][energy+1][1<<l];
       v[x][y][maxe][0]=true;
       int minm=0;
       while(!q.isEmpty())
       {
        int s=q.size();
        for(int i=0;i<s;i++)
        {
        Pair cur=q.poll();
        if(cur.mask==allcollect)
        {
            return minm;
        }
        int ro=cur.r;
        int co=cur.c;
        for(int j=0;j<4;j++)
        {
            int newr=ro+row[j];
            int newc=co+col[j];
            if(newr>=m||newr<0||newc>=n||newc<0)
            continue;

            if(c[newr][newc]=='X')
            continue;

            if(cur.e==0)
            continue;

            int newe=cur.e-1;
            int newmask=cur.mask;
            if(c[newr][newc]=='L')
            {
                newmask|=(1<<littmask[newr][newc]);
            }
            if(c[newr][newc]=='R')
            {
                newe=energy;
            }
            if(!v[newr][newc][newe][newmask])
            {
                v[newr][newc][newe][newmask]=true;
                q.add(new Pair(newr,newc,newe,newmask));
            }
        }
        }
         minm++;
       }
       return -1;
    }
}