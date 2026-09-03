class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
            }
        }
        int i=0;
        int j=0;
        int maxu=0;
        int finalv=Integer.MIN_VALUE;
        while(j<customers.length)
        {
            if(grumpy[j]==1)
            {
                maxu+=customers[j];
            }
            if((j-i+1)==minutes)
            {
                finalv=Math.max(finalv,maxu);
                if(grumpy[i]==1)
                {
                    maxu=maxu-customers[i];
                }
                i++;
            }
            j++;
        }
        return sum+finalv;
    }
}