class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int []p:r)
        {
            int key=p[0];
            int v=p[1];
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(v);
        }
        long m = (long)(n - map.size()) * 2;
        for(int row:map.keySet())
        {
            boolean a = true;
    boolean b = true;
    boolean c = true;
            for(int seat:map.get(row))
            {
                int v=seat;
                if(v>=2&&v<=5)
                {
                    a=false;
                }
               if(v>=4&&v<=7)
                {
                    b=false;
                }
               
                if (v >= 6 && v <= 9) {
                    c = false;
                }
            }
            if(a&&c)
            {
                m+=2;
            }
            else if (a || b || c) {
                m += 1;
            }
        }
        return (int)m;
    }
}