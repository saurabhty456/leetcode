class Solution {
    public String reverseWords(String s) {
        String r="";
        int end=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
            r+=s.substring(i+1,end) + " ";
            end=i;
            }
        }
        r+=s.substring(0,end);
        return r.trim().replaceAll("\\s+"," ");
    }
}