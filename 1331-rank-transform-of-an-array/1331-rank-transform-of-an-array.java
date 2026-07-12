class Solution {
    public int[] arrayRankTransform(int[] arr) {
      Map<Integer,Integer>map=new HashMap<>();
      int c[]=Arrays.copyOf(arr,arr.length);
      int ra[]=new int [arr.length];
      Arrays.sort(c);
      int rank=1;
      for(int i=0;i<arr.length;i++)
      {
        if(!map.containsKey(c[i]))
        {
            map.put(c[i],rank);
            rank++;
        }
      }
      for(int i=0;i<arr.length;i++)
      {
        int r=map.get(arr[i]);
        ra[i]=r;
      }
      return ra;
    }
}