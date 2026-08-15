class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
       int j=0;
       HashMap<Character,Integer>map=new HashMap<>();
       int max=0;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch)>1)
        {
            char c=s.charAt(j);
            map.put(c,map.get(c)-1);
            j++;
        }
        max=Math.max(max,i-j+1);
       }
       return max; 
    }
}