class Solution {
    public int slidingPuzzle(int[][] board) {

       Queue<String>q=new LinkedList<>();
       Set<String>visit=new HashSet<>();
       int row[]={-1,0,1,0};
       int col[]={0,1,0,-1};
       String s="";
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<3;j++)
        {
            s+=board[i][j];
        }
       }
       q.offer(s);
       visit.add(s);
       int m=0;
       while(!q.isEmpty())
       {
        int l=q.size();
        for(int i=0;i<l;i++)
        {
            String c=q.poll();
            if(c.equals("123450"))
            return m;

            int zero=c.indexOf('0');
            int r=zero/3;
            int co=zero%3;
            for(int j=0;j<4;j++)
            {
                int nr=r+row[j];
                int nc=co+col[j];
                if(nr>=0&&nr<2&&nc>=0&&nc<3)
                {
                int next=nr*3+nc;
                String cu=swap(c,zero,next);
                if(!visit.contains(cu))
                {
                    visit.add(cu);
                    q.offer(cu);
                }
                }
            }
        }
        m++;
       }
       return -1;
    }
    public String swap(String ns,int w,int k)
    {
        char[] ch=ns.toCharArray();
        char temp=ch[w];
        ch[w]=ch[k];
        ch[k]=temp;
        return new String(ch);
    }
}