class Solution {
    public int countSubstrings(String s) {
        int c=0;
        boolean t[][]=new boolean[1001][1001];
        int n=s.length();
        for(int L=1;L<=n;L++)
        {
            for(int i=0;i<n-L+1;i++)
            {
                int j=L+i-1;
                if(i==j)
                {
                    t[i][i]=true;
                }
                else if(i+1==j)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        t[i][j]=true;
                    }
                }
                else if(s.charAt(i)==s.charAt(j)&&t[i+1][j-1])
                {
                    t[i][j]=true;
                }
                else
                {
                    t[i][j]=false;
                }
                if(t[i][j])
                {
                    c++;
                }
            }
        }
        return c;
    }
}