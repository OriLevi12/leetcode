/**
 * LeetCode 42 - Trapping Rain Water
 *
 * Approach: Two Pointers
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public int trap(int[] height) {
        // Initialize two pointers at the start and end of the array
        int left = 0, right = height.length - 1;

        // Track the highest wall we've seen so far from each side
        int leftMax = 0, rightMax = 0;

        // This will store the total trapped water
        int water = 0;

        // Move the two pointers toward each other
        while (left < right) {

            // Decide which side to process based on which is currently lower
            if (height[left] < height[right]) {
                // Left side is lower → leftMax limits water level here

                if (leftMax > height[left]) {
                    // Current left is a dip below the max seen → trap water
                    water += leftMax - height[left];
                } else {
                    // Update leftMax if current wall is taller
                    leftMax = height[left];
                }

                // Move left pointer to the right
                left++;

            } else {
                // Right side is lower or equal → rightMax limits water level here

                if (rightMax > height[right]) {
                    // Current right is a dip below the max seen → trap water
                    water += rightMax - height[right];
                } else {
                    // Update rightMax if current wall is taller
                    rightMax = height[right];
                }

                // Move right pointer to the left
                right--;
            }
        }

        // Return the total amount of water trapped
        return water;
    }
}
