class Solution {
    public int passwordStrength(String p) {
        int c=0;
        Set<Character>set=new HashSet<>();
        for(char w :p.toCharArray()){
            set.add(w);
        }
        for(char j : set)
        {
            int i=(int)j;
            if(i>=(int)'a'&&i<=(int)'z')
            {
                c+=1;
            }
            else if(i>=(int)'A'&&i<=(int)'Z')
            {
                c+=2;
            }
            else if(i>=(int)'0'&&i<=(int)'9')
            {
                c+=3;
            }
            else if(j=='!'||j=='#'||j=='@'||j=='$')
            {
                c+=5;
            }
        }
        return c;
    }
}