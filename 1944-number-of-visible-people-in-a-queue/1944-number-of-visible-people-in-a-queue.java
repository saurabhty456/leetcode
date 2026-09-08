class Solution {
    public int[] canSeePersonsCount(int[] h) {
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[h.length];
        for(int j=h.length-1;j>=0;j--)
        {
            int e=h[j];
            while(!st.isEmpty()&&e>st.peek())
            {
                st.pop();
                ans[j]+=1;
            }
            if(!st.isEmpty())
            {
                ans[j]++;
            }
            st.push(e);
        }
        return ans;
    }
}