   // Plan:
        // 1. Put all numbers into a HashSet for O(1) lookups.
        // 2. For each number, only start counting if (num - 1) is NOT in the set (start of a sequence).
        // 3. From each start, count consecutive numbers forward until the streak ends.
        // 4. Keep track of the longest streak found.
        // Time: O(n) average (each number visited at most twice).
        // Space: O(n) for the HashSet.

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);

        int best = 0;
        for(int x : set){
            if(!set.contains(x-1)){ //start of a run
                int cur = x, len = 1;
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                best = Math.max(best,len);
            }
        }
        return best;
    }
}