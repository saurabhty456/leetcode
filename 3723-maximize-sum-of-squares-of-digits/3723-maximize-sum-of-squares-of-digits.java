class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder r=new StringBuilder();
       if(sum>num*9)
       return "";

       for(int i=0;i<num;i++)
       {
        int d=Math.min(9,sum);
        r.append(d);
        sum-=d;
       }
       if(sum!=0)
       {
        return "";
       }
       return r.toString();
    }
}