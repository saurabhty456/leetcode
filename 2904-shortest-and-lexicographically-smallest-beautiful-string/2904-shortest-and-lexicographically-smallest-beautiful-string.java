class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int j = 0;
        int c = 0;
        int n = s.length();
        String result = "";

        while (j < n) {
            if (s.charAt(j) == '1') {
                c++;
            }

            // Shrink window while maintaining exactly k '1's
            while (c == k) {
                String currentSubstring = s.substring(i, j + 1);
                
                // Track the shortest, lexicographically smallest substring
                if (result.isEmpty() || 
                    currentSubstring.length() < result.length() || 
                    (currentSubstring.length() == result.length() && currentSubstring.compareTo(result) < 0)) {
                    result = currentSubstring;
                }

                // Remove character at the left pointer and shift right
                if (s.charAt(i) == '1') {
                    c--;
                }
                i++;
            }
            j++;
        }

        return result;
    }
}
