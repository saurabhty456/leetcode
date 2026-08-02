class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>()); // Elements in nums1 but not in nums2
        adj.add(new ArrayList<>()); // Elements in nums2 but not in nums1

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Populate sets to remove duplicates and allow O(1) lookups
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        // Find elements in nums1 that are missing in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                adj.get(0).add(num);
            }
        }

        // Find elements in nums2 that are missing in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                adj.get(1).add(num);
            }
        }

        return adj;
    }
}