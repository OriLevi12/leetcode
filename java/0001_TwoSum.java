import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        return twoSumV1(nums, target);

        }

    /*
    *Version 1 - standard approach - add after checking
    */     
    private int[]twoSumV1(int[] nums, int target){    
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement))
                return new int[] {i, map.get(complement)};

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*
    *Version 2 - Add first element before checking - less standard
    */
    private int[]twoSumV2(int[] nums, int target){    
        Map<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for(int i=1; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement))
                return new int[] {i, map.get(complement)};

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}