class Solution {
    public int minimumPushes(String s) {
         int n=s.length();
         int freq[]=new int[26];
         for(char ch:s.toCharArray())
         {
            freq[ch-'a']++;
         }
         Arrays.sort(freq);
        int sum=0;
        int w=1;
        int j=0 ; 
        for(int i=25;i>=0;i--)
        {
            sum+=freq[i]*w;
            j++;
            if(j%8==0)
            {
                w++;
            }
            // sum+=freq[i]*w;
        }
        return sum;
    }
}