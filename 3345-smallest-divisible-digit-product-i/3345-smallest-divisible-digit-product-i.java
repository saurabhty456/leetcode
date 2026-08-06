class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
        {
            if(sumd(i,t))
            {
                return i;
            }
        }
        return 0;
    }
    public boolean sumd(int d,int t)
    {
        int p=1;
        while(d>0)
        {
            int s=d%10;
            p*=s;
            d=d/10;
        }
        if(p%t==0)
        {
            return true;
        }
        return false;
    }
}