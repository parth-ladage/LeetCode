class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(seen.containsKey(comp)){
                result[0] = seen.get(comp);
                result[1] = i;
            } else {
                seen.put(nums[i], i);
            }
        }
        return result;
    }
}