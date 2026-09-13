class Solution {
    public int myAtoi(String s) {
        StringBuilder r=new StringBuilder();
        s=s.trim();
        int w=0;
        if(s.length()==0)
        {
            return 0;
        }
        if(s.charAt(0)=='-'||s.charAt(0)=='+')
        {
            r.append(s.charAt(0));
            w++;
        }
        for(int i=w;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                break;
            }
            else if(c>='0'&&c<='9')
            {
                r.append(c);
            }
            else 
            {
                break;
            }
        }
        String f = r.toString();
        if (f.length() == 0 || f.equals("-") || f.equals("+")) {
            return 0;
        }

        int sign = 1;
        int start = 0;

        if (f.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (f.charAt(0) == '+') {
            start = 1;
        }

        long num = 0;

        for (int i = start; i < f.length(); i++) {

            int digit = f.charAt(i) - '0';

            num = num * 10 + digit;
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)(sign * num);
    }
}