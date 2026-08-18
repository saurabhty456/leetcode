class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       Stack<Integer>q=new Stack<>();
        int j=0;
        for(int num:pushed)
        {
            q.push(num);
            while(!q.isEmpty()&&q.peek()==popped[j])
            {
                q.pop();
                j++;
            }
        }
        return q.isEmpty();
    }
}