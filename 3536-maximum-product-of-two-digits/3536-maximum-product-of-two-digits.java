class Solution {
    public int maxProduct(int n) {
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        while (n > 0) {
            int d = n % 10;

            if (d >= f) {
                s = f;   // Previous largest becomes second largest
                f = d;
            } else if (d > s) {
                s = d;
            }

            n /= 10;
        }

        return f * s;
    }
}