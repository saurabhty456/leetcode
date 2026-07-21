class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
       int maxOne=0;
       for(int k=0;k<s.length();k++)
       {
        if(s.charAt(k)=='1')
        {
            maxOne++;
        }
       }
       int maxZ[]=new int[s.length()];
       int i=0;
       int w=0;
       while(i<s.length())
       {
        if(s.charAt(i)=='0')
        {
            int l=i;
            while(i<s.length()&&s.charAt(i)=='0')
            {
                i++;
            }
            maxZ[w++]=i-l;
        }
        else
        {
            i++;
        }
       }
       int maxP=0;
       for(int j=1;j<w;j++)
       {
        maxP=Math.max(maxZ[j]+maxZ[j-1],maxP);
       }
       return maxP+maxOne;
    }
}