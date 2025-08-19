class Solution:
    def search(self, nums, target):
        """
        Plan:
        1. Initialize two pointers (lo, hi).
        2. While lo <= hi:
           - Find mid.
           - If nums[mid] == target → return mid.
           - If left half is sorted:
               * Check if target lies inside it → move hi = mid - 1
               * Else → move lo = mid + 1
           - Else (right half is sorted):
               * Check if target lies inside it → move lo = mid + 1
               * Else → move hi = mid - 1
        3. If not found → return -1

        Time Complexity: O(log n)
        Space Complexity: O(1)
        """
        lo, hi = 0, len(nums) - 1

        while lo <= hi:
            mid = (lo + hi) // 2
            if nums[mid] == target:
                return mid

            if nums[lo] <= nums[mid]:  # left half sorted
                if nums[lo] <= target < nums[mid]:
                    hi = mid - 1
                else:
                    lo = mid + 1
            else:  # right half sorted
                if nums[mid] < target <= nums[hi]:
                    lo = mid + 1
                else:
                    hi = mid - 1

        return -1
