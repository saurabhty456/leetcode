class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumE=0;
        int sumO=0;
        for(int i=1;i<=n;i++)
        {
            sumE+=2*i;
            sumO+=2*i-1;
        }
        int d= gcd(sumE,sumO);
        return d;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}