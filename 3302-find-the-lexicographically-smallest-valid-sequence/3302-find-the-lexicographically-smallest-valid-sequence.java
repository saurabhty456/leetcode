class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i=n-1;
        int j=m-1;
        int rightm=0;
        int suf[]=new int[n+1];
        while(i>=0)
        {
            if(j>=0&&word1.charAt(i)==word2.charAt(j))
            {
                rightm++;
                j--;
            }
            suf[i]=rightm;
            i--;
        }
        int k=0;
        int w=0;
        boolean change=false;
        int ans[]=new int[m];
        int ind=0;
        while(k<n&&w<m)
        {
            if(word1.charAt(k)==word2.charAt(w))
            {
                ans[ind++]=k;
                w++;
            }
            else if(change==false&&suf[k+1]>=m-w-1)
            {
                ans[ind++]=k;
                change=true;
                w++;
            }
            k++;
        }
        if(w!=m)
        {
            return new int[]{};
        }
        return ans;
    }
}