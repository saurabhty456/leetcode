class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder a=new StringBuilder();
        int last[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
           last[s.charAt(i)-'a']=i;
        }
        boolean visit[]=new boolean[26];
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            int ind=cur-'a';
            if(visit[ind])
            {
                continue;
            }
            while(!stack.isEmpty()&&stack.peek()>cur&&last[stack.peek()-'a']>i)
            {
                char re=stack.pop();
                visit[re-'a']=false;
            }
            stack.push(cur);
            visit[ind]=true; 
        }
        for(char ch:stack)
        {
            a.append(ch);
        }
        return a.toString();
    }
}