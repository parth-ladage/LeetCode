class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(visited.containsKey(nums[i])){
                visited.put(nums[i], visited.get(nums[i]) + 1);
            } else {
                visited.put(nums[i], 1);
            }
        }
        int result = 0;
        for(int key : visited.keySet()){
            if(visited.get(key)==1){
                result = key;
            }
        }

        return result;
    }
}