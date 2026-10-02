class Solution {
    List<String>r=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
         solve(new StringBuilder(),n,0,0);
         return r;
    }
    public void solve(StringBuilder curr,int n,int open,int close)
    {
        if(curr.length()==2*n)
        {
            r.add(curr.toString());
            return;
        }
        if(open<n)
        {
            curr.append('(');
            solve(curr,n,open+1,close);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open)
        {
             curr.append(')');
            solve(curr,n,open,close+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}