class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        // HashMap<Integer, Integer> visited = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     if(visited.containsKey(nums[i])){
        //         visited.put(nums[i], visited.get(nums[i]) + 1);
        //     } else {
        //         visited.put(nums[i], 1);
        //     }
        // }
        // for(int key : visited.keySet()){
        //     if(visited.get(key)==1){
        //         result = key;
        //     }
        // }

        for(int num: nums){
            result ^= num;
        }

        return result;
    }
}