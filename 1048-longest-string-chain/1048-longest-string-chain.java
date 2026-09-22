class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));
        int n=words.length;
        int dp[]=new int[n];
        java.util.Arrays.fill(dp,1);
        int maxl=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(isbool(words[j],words[i]))
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    maxl=Math.max(dp[i],maxl);
                }
            }
        }
        return maxl;
    }
    public boolean isbool(String w1,String w2)
    {
        int m=w1.length();
        int k=w2.length();
        if(m>=k||k-m!=1)
        return false;

        int i=0;
        int j=0;
        while(i<m&&j<k)
        {
            if(w1.charAt(i)==w2.charAt(j))
            {
            i++;
            }
            j++;
        }
        return i==m;
    }
}