class Pair
{
    int t;
    int f;
    public Pair(int t,int f)
    {
        this.t=t;
        this.f=f;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
       for(int i=0;i<=n;i++)
       {
        adj.add(new ArrayList<>());
       }
       for(int i=0;i<times.length;i++)
       {
        adj.get(times[i][0]).add(new Pair(times[i][2],times[i][1]));
       }
       PriorityQueue<Pair>q=new PriorityQueue<>((x,y)-> Integer.compare(x.t, y.t));
       q.add(new Pair(0,k));
       int pathTime[]=new int[n+1];
       for(int i=0;i<pathTime.length;i++)
       {
        pathTime[i]=(int)1e9;
       }
       pathTime[k]=0;
       while(!q.isEmpty())
       {
        Pair c=q.poll();
        int ti=c.t;
        int node=c.f;
        if(ti>pathTime[node])
        {
            continue;
        }
        for(Pair it:adj.get(node))
        {
            int newT=it.t;
            int newN=it.f;
            if(newT+ti<pathTime[newN])
            {
                pathTime[newN]=newT+ti;
                q.add(new Pair(newT+ti,newN));
            }
        }
       }
       int ans=0;
       for(int i=1;i<=n;i++)
       {
        if(pathTime[i]==(int)1e9)
        {
            return -1;
        }
        ans=Math.max(ans,pathTime[i]);
       }
       return ans;
    }
}