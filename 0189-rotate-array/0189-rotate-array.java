class Solution {
    public void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        // int[] temp= new int[k];
        // for(int i=0; i<k; i++){
        //     temp[i]=nums[i];
        // }
        // for(int i=k; i<nums.length; i++){
        //     nums[i-k] = nums[i];
        // }
        // for(int i=nums.length-k; i<nums.length; i++){
        //     nums[i] = temp[i-(nums.length-k)];
        // }
        // reverse(nums, 0, k-1);
        // reverse(nums, k, nums.length-1);
        // reverse(nums, 0, nums.length-1);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}