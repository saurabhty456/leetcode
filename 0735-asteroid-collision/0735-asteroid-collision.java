class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer>st=new Stack<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<ast.length;i++)
        {
            int b=ast[i];
            boolean alive=true;
            while((alive &&!st.empty())&&st.peek()>0&&b<0)
            {
               if(st.peek()==-b)
               {
                st.pop();
                alive=false;
               }
               else if(st.peek()<-b)
               {
                st.pop();
               }
               else
               {
                alive=false;
               }
            }
            if(alive)
            {
                st.push(b);
            }
        }
       int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}