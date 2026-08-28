class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int n = target.length();
        StringBuilder sb = new StringBuilder();
        
        // Try to match target prefix as far as possible
        int matchLen = 0;
        while (matchLen < n) {
            int idx = target.charAt(matchLen) - 'a';
            if (freq[idx] > 0) {
                sb.append(target.charAt(matchLen));
                freq[idx]--;
                matchLen++;
            } else {
                break;
            }
        }

        // Backtrack from the furthest match point to find a valid greater character
        for (int i = matchLen; i >= 0; i--) {
            // If we are backtracking, we must restore the character we previously consumed
            if (i < matchLen) {
                int prevIdx = target.charAt(i) - 'a';
                freq[prevIdx]++;
                sb.setLength(i);
            }

            // If we are beyond target length, we just need any valid permutation (if matching exactly)
            // But we need STRICTLY greater, so we need a larger character at position 'i'
            int startCharIdx = (i < n) ? (target.charAt(i) - 'a' + 1) : 0;

            // Find the smallest available character greater than target.charAt(i)
            for (int c = startCharIdx; c < 26; c++) {
                if (freq[c] > 0) {
                    sb.append((char) (c + 'a'));
                    freq[c]--;
                    
                    // Fill the remaining string with the smallest available characters
                    for (int j = 0; j < 26; j++) {
                        while (freq[j] > 0) {
                            sb.append((char) (j + 'a'));
                            freq[j]--;
                        }
                    }
                    return sb.toString();
                }
            }
        }

        return ""; // No lexicographically greater permutation is possible
    }
}
