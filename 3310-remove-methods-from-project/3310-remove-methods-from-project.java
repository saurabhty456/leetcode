class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] inv) {
      ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<inv.length;i++)
      {
        adj.get(inv[i][0]).add(inv[i][1]);
      }
      boolean visit[]=new boolean[n];
      dfs(adj,visit,k);
      for(int r[]:inv)
      {
        int u=r[0];
        int v=r[1];
        if(!visit[u]&&visit[v])
        {
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(i);
            }
            return list;
        }
      }
       List<Integer>ans=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        if(!visit[i])
        ans.add(i);
       }
       return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>>adj,boolean visit[],int node)
    {
        visit[node]=true;
        for(Integer it:adj.get(node))
        {
            if(visit[it]==false)
            {
            dfs(adj,visit,it);
            }
        }
    }
}