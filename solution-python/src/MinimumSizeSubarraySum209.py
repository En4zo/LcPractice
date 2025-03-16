# -*- coding: utf-8 -*-
"""
@Time ： 2025-03-16 17:04
@Auth ： Enzo
@File ：MinimumSizeSubarraySum209.py
@IDE ：PyCharm

"""

class MinimumSizeSubarraySum209(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        output = float('inf')
        start = 0
        end = 0
        sublength = 0
        sums = 0

        while(end < len(nums)):
            sums += nums[end]
            while(sums >= target):
                sublength = (end - start +1)
                output = min(output,sublength)
                sums -= nums[start]
                start += 1

            end +=1
        return output if output != float('inf') else 0
