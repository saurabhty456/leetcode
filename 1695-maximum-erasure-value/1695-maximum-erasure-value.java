// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int i=0;
//         int j=0;
//         int sum=0;
//         int max=Integer.MIN_VALUE;
//         for(j=0;j<nums.length;j++)
//         {
//             map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//             sum+=nums[j];
//             while(map.get(nums[j])>1)
//             {
//                 map.put(nums[i],map.get(nums[i])-1);
//                 sum-=nums[i];
//                 i++;
//             }
//             max=Math.max(sum,max);
//         }
//         return max;
//     }
// }
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        boolean[] set = new boolean[10001];

        int i=0;
        int sum = 0;
        int max = 0;

        for(int j=0; j<n; j++){
            sum += nums[j];

            while(set[nums[j]]){
                set[nums[i]] = false;
                sum -= nums[i];
                i++;
            } 

            set[nums[j]] = true;;

            max = Math.max(sum, max);
        }

        return max;
    }
}