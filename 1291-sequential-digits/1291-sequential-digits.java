class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>list=new ArrayList<>();
        String a="123456789";
        for(int len=2;len<=9;len++)
        {
            for(int s=0;s+len<=9;s++)
            {
                int num=Integer.parseInt(a.substring(s,s+len));
                if(num>=low&&num<=high)
                {
                    list.add(num);
                }
            }
        }
        return list;
    }
}