
class Solution {
    private static final long MOD = 1_000_000_007L;

    private long[] sum;
    private long[] sq;
    private long[] lazy;
    private int n;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        sq = new long[4 * n];
        lazy = new long[4 * n];

        int[] last = new int[100001];
        java.util.Arrays.fill(last, -1);

        long ans = 0;

        for (int r = 0; r < n; r++) {
            int x = nums[r];

            int left = last[x] + 1;
            update(1, 0, n - 1, left, r);

            last[x] = r;

            // Sum of squared distinct counts for
            // all subarrays ending at index r.
            ans = (ans + sq[1]) % MOD;
        }

        return (int) ans;
    }

    private void apply(int node, int l, int r, long delta) {
        long len = r - l + 1L;
        long oldSum = sum[node];

        sq[node] = (
            sq[node]
            + 2L * delta % MOD * oldSum % MOD
            + len % MOD * delta % MOD * delta % MOD
        ) % MOD;

        sum[node] = (oldSum + len * delta) % MOD;
        lazy[node] += delta;
    }

    private void push(int node, int l, int r) {
        if (lazy[node] == 0 || l == r) {
            return;
        }

        int mid = l + (r - l) / 2;
        long delta = lazy[node];

        apply(node * 2, l, mid, delta);
        apply(node * 2 + 1, mid + 1, r, delta);

        lazy[node] = 0;
    }

    private void update(
        int node, int l, int r, int ql, int qr
    ) {
        if (ql <= l && r <= qr) {
            apply(node, l, r, 1);
            return;
        }

        push(node, l, r);

        int mid = l + (r - l) / 2;

        if (ql <= mid) {
            update(node * 2, l, mid, ql, qr);
        }

        if (qr > mid) {
            update(node * 2 + 1, mid + 1, r, ql, qr);
        }

        sum[node] = (
            sum[node * 2] + sum[node * 2 + 1]
        ) % MOD;

        sq[node] = (
            sq[node * 2] + sq[node * 2 + 1]
        ) % MOD;
    }
}
