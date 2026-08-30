class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIn = 0, maxIn = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIn]) minIn = i;
            if (nums[i] > nums[maxIn]) maxIn = i;
        }
        
        int i = Math.min(minIn, maxIn);
        int j = Math.max(minIn, maxIn);
        
        // Case 1: Delete from front only
        int front = j + 1;
        
        // Case 2: Delete from back only
        int back = n - i;
        
        // Case 3: Delete from both ends
        int both = (i + 1) + (n - j);
        
        return Math.min(Math.min(front, back), both);
    }
}
