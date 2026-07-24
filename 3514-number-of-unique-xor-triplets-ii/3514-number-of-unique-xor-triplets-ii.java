class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> pairXor = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        int n=nums.length;

// O(n²)
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        pairXor.add(nums[i] ^ nums[j]);
    }
}

// pairXor.size() <= 2048

// O(n × 2048) = O(n)
for (int x : pairXor) {
    for (int num:nums) {
        ans.add(x ^ num);
    }
}
return ans.size();
    }
}