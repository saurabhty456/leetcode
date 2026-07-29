class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int max=0;
        int c=0;
        while(j<s.length())
        {
            char ch=s.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                c++;
            }
            if((j-i)+1==k)
            {
                max=Math.max(c,max);
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    c--;
                }
                i++;
            }
            j++;
        }
        return max;
    }
}