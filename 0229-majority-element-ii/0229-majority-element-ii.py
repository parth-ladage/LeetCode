class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        res = []
        seen = {}
        for num in nums:
            if num in seen:
                seen[num]+=1
            else:
                seen[num]=1

            if seen[num] > len(nums)/3 and num not in res:
                res.append(num)
        
        # for num in seen:
        #     if seen[num] > len(nums)/3 :
        #         res.append(num)
            
        return res

        