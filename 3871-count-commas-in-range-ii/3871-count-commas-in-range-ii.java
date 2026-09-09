class Solution {
    public long countCommas(long n) {
        long total = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            total += (n - start+1);

            start *= 1000;
        }

        return total;
    }
}