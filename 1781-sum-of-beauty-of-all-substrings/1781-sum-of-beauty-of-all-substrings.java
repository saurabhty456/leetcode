//khud se kiya
class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                sum+=subtract(j,s,freq);
            }
        }
        return sum;
    }
    public int subtract(int e,String s,int freq[])
    {
        char c=s.charAt(e);
        freq[c-'a']++;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<26;k++)
        {
            if(freq[k]!=0)
            {
                max=Math.max(max,freq[k]);
                min=Math.min(min,freq[k]);
            }
        }
        return max-min;
    }
}