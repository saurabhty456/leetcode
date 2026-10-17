import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int[] copy = Arrays.copyOf(nums, n);

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = copy[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int f = sum(a);
            int s = sum(b);

            if (f != s) {
                return Integer.compare(f, s);
            }
            return Integer.compare(a, b);
        });

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        int swap = 0;
        int i = 0;

        while (i < n) {
            if (map.get(nums[i]) == i) {
                i++;
            } else {
                int j = map.get(nums[i]);

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                swap++;
            }
        }

        return swap;
    }

    public int sum(int d) {
        int s = 0;

        while (d > 0) {
            s += d % 10;
            d /= 10;
        }

        return s;
    }
}