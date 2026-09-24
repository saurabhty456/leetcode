class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int lastm=0;
        int lastp=0;
        int lastg=0;
        int tl=0;
        for(int i=0;i<garbage.length;i++)
        {
            String w=garbage[i];
            tl+=w.length();
            if(w.contains("M"))
            lastm=i;

            if(w.contains("P"))
            lastp=i;

            if(w.contains("G"))
            lastg=i;
        }
        for(int i=0;i<travel.length;i++)
        {
            if(lastm>i)
            tl+=travel[i];

            if(lastp>i)
            tl+=travel[i];

            if(lastg>i)
            tl+=travel[i];
        }
        return tl;
    }
}