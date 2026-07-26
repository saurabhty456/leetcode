class Solution {
    public String reverseVowels(String s) {
       StringBuilder v=new StringBuilder();
       for(char ch:s.toCharArray())
       {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            v.append(ch);
        }
       }
       v.reverse();
       String n="";
       int w=0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
        {
            n+=v.toString().charAt(w++);
        }
        else
        {
            n+=s.charAt(i);
        }
       }
       return n;
    }
}