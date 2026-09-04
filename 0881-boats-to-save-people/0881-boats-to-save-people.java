class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        int i=0;
        int j=people.length-1;
        Arrays.sort(people);
        while(i<=j)
        {
           c++;
           if(people[i]+people[j]<=limit)
           {
            i++;
           }
           j--;
        }
        return c;
    }
}