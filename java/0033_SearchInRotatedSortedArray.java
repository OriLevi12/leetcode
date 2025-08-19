class Solution {
    public int search(int[] nums, int target) {
        /*
        Plan:
        1. Initialize lo and hi.
        2. While lo <= hi:
           - Compute mid.
           - If nums[mid] == target → return mid.
           - If left half is sorted:
               * If target is inside → move hi = mid - 1
               * Else → move lo = mid + 1
           - Else (right half is sorted):
               * If target is inside → move lo = mid + 1
               * Else → move hi = mid - 1
        3. Return -1 if not found.

        Time Complexity: O(log n)
        Space Complexity: O(1)
        */
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;

            if (nums[lo] <= nums[mid]) { // left half sorted
                if (nums[lo] <= target && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else { // right half sorted
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
