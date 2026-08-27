class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int currentNumber = 1;
        
        for (int num : target) {
            // Push and Pop the missing numbers between currentNumber and num
            while (currentNumber < num) {
                result.add("Push");
                result.add("Pop");
                currentNumber++;
            }
            // Push the matching number
            result.add("Push");
            currentNumber++;
        }
        
        return result;
    }
}

