class Solution {
    public int maximumLengthSubstring(String s) {
       Map<Character,Integer>map=new HashMap<>();
       int max=0;
       int j=0;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch)>2)
        {
            map.put(s.charAt(j),map.get(s.charAt(j))-1);
            j++;
        }
         max=Math.max(max,i-j+1);
       }
       return max; 
    }
}