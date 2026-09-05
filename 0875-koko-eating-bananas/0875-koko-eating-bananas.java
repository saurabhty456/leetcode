class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long min=1;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        long m=-1;
        while(min<=max)
        {
            long mid=min+(max-min)/2;
            long totalh=total(mid,piles);
            if(totalh<=h)
            {
                m=mid;
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return (int) m;
    }
    public long total(long mi,int piles[])
    {
        // int total=0;
        // for(int i=0;i<piles.length;i++)
        // {
        //     int r=piles[i]%mi;
            
        //     if(r==0)
        //     {
        //         total+= piles[i]/mi;
        //     }
        //     else
        //     {
        //         total+= 1;
        //     }
        // }
        // return total;

        long total = 0 ;
        for (int num : piles){

            if(num < mi){
                total++;
            }
            else if ((num % mi) != 0){
                total += num/mi + 1; 
            }
            else{
                total += num/mi;
            }
        }
        return total;
    }
}