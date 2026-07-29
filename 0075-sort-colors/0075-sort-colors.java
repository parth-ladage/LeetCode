class Solution {
    public void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    
    public void sortColors(int[] nums) {
        // int cnt0 = 0;
        // int cnt1 = 0;
        // int cnt2 = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0){
        //         cnt0++;
        //     } else if(nums[i]==1){
        //         cnt1++;
        //     } else {
        //         cnt2++;
        //     }
        // }
        // for(int i=0; i<cnt0; i++){
        //     nums[i]=0;
        // }
        // for(int i=cnt0; i<cnt0+cnt1; i++){
        //     nums[i]=1;
        // }
        // for(int i=cnt0+cnt1; i<cnt0+cnt1+cnt2; i++){
        //     nums[i]=2;
        // }
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}