class Solution {
    public int maxProduct(int n) {
        String a=Integer.toString(n);
       int arr[]=new int[a.length()];
       int w=0;
       while(n>0)
       {
        int d=n%10;
        arr[w++]=d;
        n=n/10;
       }
       Arrays.sort(arr);
       return arr[arr.length-1]*arr[arr.length-2]; 
    }
}