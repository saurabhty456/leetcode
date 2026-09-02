class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int pref[]=new int[n];
        for(int i=0;i<bookings.length;i++)
        {
            int f=bookings[i][0];
            int s=bookings[i][1];
            int p=bookings[i][2];
            for(int j=f-1;j<s;j++)
            {
                pref[j]+=p;
            }
        }
        return pref;
    }
}