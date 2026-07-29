class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            // while(!st.empty()&&c=='*')
            // {
            //     st.pop();
            // }
            // st.push(c);
            if(c != '*'){
                st.push(c);
            }else if(!st.empty()){
                st.pop();
            }
        }
        while(!st.empty())
        {
            a.append(st.pop());
        }
        return a.reverse().toString();
    }
}