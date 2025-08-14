class Solution:
    def maxFrequency(self, nums: List[int], k: int) -> int:
        nums.sort()
        left=0
        total_sum=0
        max_freq=0

        for right in range(len(nums)):
            total_sum+= nums[right]

            while nums[right]*(right-left+1) > total_sum+k:
                total_sum-=nums[left]
                left+=1

            max_freq = max(max_freq,right-left+1)
            
        return max_freq

        
        