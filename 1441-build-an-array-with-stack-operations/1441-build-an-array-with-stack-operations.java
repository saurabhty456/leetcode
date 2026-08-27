class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>s=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=target.length-1;i>=0;i--)
        {
            st.push(target[i]);
        }
        int c=1;
        while(!st.isEmpty())
        {
            if(st.peek()==c)
            {
                s.add("Push");
                st.pop();
                c++;
            }
            else
            {
               s.add("Push");
               s.add("Pop");
               c++; 
            }
        }
        return s;
    }
}