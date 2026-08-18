class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>q=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++)
        {
            int v=pushed[i];
            while(!q.isEmpty()&&q.peek()==popped[j])
            {
                q.pop();
                j++;
            }
            q.push(v);
        }
        boolean a=true;
        System.out.println(q);
        while(!q.isEmpty())
        {
            int d=q.pop();
            if(d!=popped[j])
            {
                a=false;
                break;
            }
            j++;
        }
        if(a)
        {
            return true;
        }
        return false;
    }
}