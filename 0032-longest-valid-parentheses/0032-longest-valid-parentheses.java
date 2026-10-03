// ya khud se likha h mc
// ya khud se likha h mc

// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<String>st=new Stack<>();
//         int max=0;
//         for(int i=0;i<s.length();i++)
//         {
//             max=Math.max(solve(s,i,"",i),max);
//         }
//         return max;
//     }
//     public int solve(String s,int idx,String c,int st)
//     {
//         int m=0;
//         if(idx>=s.length())
//         {
//             return m;
//         }
//         c+=s.charAt(idx);
//         if(valid(c))
//         {
//             m=Math.max(m,idx-st+1);
//         }
//         return Math.max(m,solve(s,idx+1,c,st));
//     }
//     public boolean valid(String v)
//     {
//         int open=0;
//         for(int i=0;i<v.length();i++)
//         {
//             if(v.charAt(i)=='(')
//             {
//                 open++;
//             }
//             else
//             {
//                 open--;
//             }
//             if(open<0)
//             return false;
//         }
//         return open==0;
//     }
// }
class Solution {
     public int longestValidParentheses(String s) {
        int maxl=0;
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                st.push(i);
            }
            else
            {
                maxl=Math.max(maxl,i-st.peek());
            }
        }
        return maxl;
     }
}