from collections import deque

class Solution:
    def maxSlidingWindow(self, nums: list[int], k: int) -> list[int]:
        dq = deque()
        res = []
        for i in range(len(nums)):
            if dq and dq[0] <= i-k:
                dq.popleft()
            while dq and nums[i] > nums[dq[-1]]:
                dq.pop()
            dq.append(i)


            if i>= k-1:
                res.append(nums[dq[0]])
        return res
