class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      boolean visit[]=new boolean[rooms.size()];
      dfs(0,rooms,visit);
      for(boolean i:visit)
      {
        if(!i)
        {
            return false;
        }
      }
      return true;
    }
    public void dfs(int node,List<List<Integer>> rooms,boolean visit[])
    {
        visit[node]=true;
        for(int keys:rooms.get(node))
        {
            if(!visit[keys])
            {
                dfs(keys,rooms,visit);
            }
        }
    }
}