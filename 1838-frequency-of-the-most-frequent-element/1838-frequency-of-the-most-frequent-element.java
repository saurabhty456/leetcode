class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long totalSum = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {
            totalSum += nums[right];
            
            while ((long) nums[right] * (right - left + 1) - totalSum > k) {
                totalSum -= nums[left];
                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}
