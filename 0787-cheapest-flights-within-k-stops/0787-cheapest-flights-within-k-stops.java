class Tuple
{
    int first;
    int second;
    public Tuple(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Pair
{
    int stop;
    int s;
    int d;
    Pair(int stop,int s,int d)
    {
        this.stop=stop;
        this.s=s;
        this.d=d;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] f, int src, int dst, int k) {
        ArrayList<ArrayList<Tuple>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<f.length;i++)
        {
            adj.get(f[i][0]).add(new Tuple(f[i][1],f[i][2]));
        }
        int dist[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,src,0));
        while(!q.isEmpty())
        {
            Pair cur=q.peek();
            q.poll();
            int st=cur.stop;
            int so=cur.s;
            int cost=cur.d;
            if(st>k)
            {
                continue;
            }
            for(Tuple it:adj.get(so))
            {
                int adjn=it.first;
                int edw=it.second;
                if(cost+edw<dist[adjn]&&st<=k)
                {
                    dist[adjn]=cost+edw;
                    q.add(new Pair(st+1,adjn,cost+edw));
                }
            }
        }
        if(dist[dst]==(int)1e9)
        return -1;

        return dist[dst];
    }
}