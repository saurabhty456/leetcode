class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i] == x){
                lst.add(i);
            }
        }
        int arr[] = new int[queries.length];
        for(int i =0;i<queries.length;i++){
            if(queries[i] > lst.size()){
                arr[i] = -1;
            }else{
                arr[i] = lst.get(queries[i]-1);
            }
        }
        return arr;
    }
}