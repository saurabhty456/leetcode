class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++)
        {
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder r=new StringBuilder();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)!='(')
            {
                r.append(s.charAt(i));
                i++;
            }
            else 
            {
                int j=i+1;
                while(s.charAt(j)!=')')
                {
                    j++;
                }
                    String nt=s.substring(i+1,j);
                    if(map.containsKey(nt))
                    {
                        r.append(map.get(nt));
                    }
                    else
                    {
                        r.append("?");
                    }
                    i=j+1;
                }
            }
        return r.toString();
    }
}