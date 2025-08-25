class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        res = []
        n = len(nums)

        for i in range(n - 3):
            # Skip duplicates for the first element
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            for j in range(i + 1, n - 2):
                # Skip duplicates for the second element
                if j > i + 1 and nums[j] == nums[j-1]:
                    continue
                
                left, right = j + 1, n - 1
                
                while left < right:
                    current_sum = nums[i] + nums[j] + nums[left] + nums[right]
                    
                    if current_sum == target:
                        res.append([nums[i], nums[j], nums[left], nums[right]])
                        
                        # Skip duplicates for the third element
                        left += 1
                        while left < right and nums[left] == nums[left-1]:
                            left += 1
                        
                        # Skip duplicates for the fourth element
                        right -= 1
                        while left < right and nums[right] == nums[right+1]:
                            right -= 1
                            
                    elif current_sum < target:
                        left += 1
                    else: # current_sum > target
                        right -= 1

        return res