class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long p=1;
        int ne=n;
        while(n>0)
        {
            int d=n%10;
            sum+=d;
            p*=d;
            n=n/10;
        }
        return ne%(sum+p)==0;
    }
}