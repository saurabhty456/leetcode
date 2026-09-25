class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1;
        long right=Integer.MAX_VALUE;
        for(int i=0;i<time.length;i++)
        {
            right=Math.min(time[i],right);
        }
        right=right*totalTrips;
        long ans=Long.MAX_VALUE;
        while(left<=right)
        {
            long mid=left+(right-left)/2;
            long sum=solve(mid,time);
            if(sum>=totalTrips)
            {
            ans=Math.min(ans,mid);
            right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return ans;
    }
    public long solve(long t,int[]time)
    {
        long s=0;
        for(int i=0;i<time.length;i++)
        {
            s+=t/time[i];
        }
        return s;
    }
}