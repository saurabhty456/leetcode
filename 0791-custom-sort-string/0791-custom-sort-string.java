class Solution {
    public String customSortString(String order, String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       StringBuilder r=new StringBuilder();
       for(int i=0;i<order.length();i++)
       {
        char c=order.charAt(i);
        if(map.containsKey(c))
        {
           while(map.get(c)>0)
           {
            r.append(c);
            map.put(c,map.get(c)-1);
           }
        }
       }
       for(char key:map.keySet())
       {
        while(map.get(key)>0)
        {
            r.append(key);
             map.put(key,map.get(key)-1);
        }
       }
       return r.toString();
    }
}