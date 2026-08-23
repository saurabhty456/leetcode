class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int mid=n/2;
        int sum1=0;
        int diff=0;
        for(int i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            if(i<mid)
            {
                if(ch=='?')
                {
                    diff++;
                }
                else
                {
                sum1+=(ch-'0');
                }
            }
            else
            {
                if(ch=='?')
                {
                    diff--;
                }
                else
                {
                   sum1-=(ch-'0'); 
                }
            }
        }
        return sum1!=(diff*-4.5);
    }
}