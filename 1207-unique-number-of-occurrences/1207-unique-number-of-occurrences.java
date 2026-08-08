class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Map<Integer,Integer>m=new HashMap<>();
        for(Integer val:map.values())
        {
            m.put(val,m.getOrDefault(val,0)+1);
        }
        for(Integer val:m.values())
        {
           if(val>1)
           {
            return false;
           }
        }
        return true;
    }
}