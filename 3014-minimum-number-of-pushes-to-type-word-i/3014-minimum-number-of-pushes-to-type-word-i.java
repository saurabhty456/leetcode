class Solution {
    public int minimumPushes(String word) {
       int n=word.length();
       if(n<=8)
       {
        return n;
       }
        int d=n%8;
        int sum=0;
        int f=1;
        for(int i=8;i<=n;i+=8)
        {
            sum+=8*f;
            f++;
        }
        return sum+d*f;
    }
}