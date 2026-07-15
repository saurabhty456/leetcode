class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder a=new StringBuilder();
      int l1=word1.length();
      int l2=word2.length();
      int min=Math.min(l1,l2);
      int i=0;
      while(i<min)
      {
        a.append(word1.charAt(i));
        a.append(word2.charAt(i));
        i++;
      }
      if(i<l1)
      {
        a.append(word1.substring(i));
      }
      if(i<l2)
      {
        a.append(word2.substring(i));
      }
      return a.toString();    
    }
}