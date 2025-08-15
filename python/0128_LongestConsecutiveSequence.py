class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        """
        Plan:
        1. Put all numbers into a set for O(1) lookups.
        2. For each number, only start counting if (num - 1) is NOT in the set (start of a sequence).
        3. From each start, count consecutive numbers forward until the streak ends.
        4. Keep track of the longest streak found.
        Time: O(n) average (each number visited at most twice).
        Space: O(n) for the set.
        """
        if not nums:
            return 0

        s = set(nums)
        best = 0

        for x in s:
            if x - 1 not in s:  # start of a run
                cur = x
                length = 1
                while cur + 1 in s:
                    cur += 1
                    length += 1
                best = max(best, length)

        return best
