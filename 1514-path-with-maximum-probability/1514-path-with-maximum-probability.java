class Pair
{
    double p;
    int f;
    public Pair(double p,int f)
    {
        this.p=p;
        this.f=f;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(new Pair(succProb[i],edges[i][1]));
            adj.get(edges[i][1]).add(new Pair(succProb[i],edges[i][0]));
        }
        PriorityQueue<Pair>q=new PriorityQueue<>( (x, y) -> Double.compare(y.p, x.p));
        q.add(new Pair(1.0,start));
        Double maxp[]=new Double[n];
        for(int i=0;i<n;i++)
        {
            maxp[i]=0.0;
        }
        maxp[start]=1.0;
        while(!q.isEmpty())
        {
            Pair cur=q.poll();
            double po=cur.p;
            int node=cur.f;
            if(po<maxp[node])
            {
                continue;
            }
            for(Pair it:adj.get(node))
            {
                double newP=it.p;
                int newN=it.f;
                if(newP*po>maxp[newN])
                {
                    maxp[newN]=newP*po;
                    q.add(new Pair(newP*po,newN));
                }
            }
        }
        if(maxp[end]==0.0)
        return 0.0;
        
        return maxp[end];
    }
}