class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
       long diff[]=new long[1000001];
       for(int i=0;i<nums1.length;i++)
       {
        int d=Math.abs(nums1[i]-nums2[i]);
        diff[d]++;
       }
       long k=(long)k1+k2;
       for(int cur=100000;cur>0&&k>0;cur--)
       {
        long opera=Math.min(diff[cur],k);
        diff[cur]-=opera;
        diff[cur-1]+=opera;
        k-=opera;
       }
       long r=0;
       for(int d=1;d<=100000;d++)
       {
        r+=diff[d]*d*d;
       }
       return r;
    }
}