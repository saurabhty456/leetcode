class Solution {
    Set<String> f = new HashSet<>();
    int maxl = 0;

    public List<String> removeInvalidParentheses(String s) {
        solve(0, "", s, 0);
        return new ArrayList<>(f);
    }

    public void solve(int i, String curr, String s, int count) {

        if (count < 0) {
            return;
        }

        if (i == s.length()) {

            if (count == 0) {

                if (curr.length() > maxl) {
                    maxl = curr.length();
                    f.clear();
                    f.add(curr);
                } 
                else if (curr.length() == maxl) {
                    f.add(curr);
                }
            }

            return;
        }

        char ch = s.charAt(i);
        if (ch == '(' || ch == ')') {
            solve(i + 1, curr, s, count);
        }

        if (ch == '(') {
            solve(i + 1, curr + ch, s, count + 1);
        } 
        else if (ch == ')') {
            solve(i + 1, curr + ch, s, count - 1);
        } 
        else {
            solve(i + 1, curr + ch, s, count);
        }
    }
}