class Solution {
    private void dfs(ArrayList<ArrayList<Integer>>adj,int node,int vist[])
    {
        vist[node]=1;
        for(Integer it:adj.get(node))
        {
            if(vist[it]==0)
            {
                dfs(adj,it,vist);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1&&i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int vist[]= new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(vist[i]==0)
            {
                cnt++;
                dfs(adj,i,vist);
            }
        }
        return cnt;
    }
}