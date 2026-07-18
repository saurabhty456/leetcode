class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ex) {
        int n=c.length;
        int co[]=Arrays.copyOf(c,c.length);
        Arrays.sort(co);
        int max=co[n-1];
        List<Boolean>list=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        if(c[i]+ex>=max)
        {
            list.add(true);
        }
        else
        {
            list.add(false);
        }
       }
       return list; 
    }
}