class Solution {
    public int compress(char[] chars) {
        int w=0;
        int r=0;
        while(r<chars.length)
        {
            char c=chars[r];
            int count=0;
            while(r<chars.length&&chars[r]==c)
            {
                r++;
                count++;
            }
            chars[w++]=c;
            if(count>1)
            {
                String s=Integer.toString(count);
                for(char t:s.toCharArray())
                {
                    chars[w++]=t;
                }
            }
        }
        return w;
    }
}