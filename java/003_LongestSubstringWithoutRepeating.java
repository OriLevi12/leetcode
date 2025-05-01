import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        return withHashMap(s);
    }

    /**Version 1 - Optimized sliding window using hash map
     * time complexity: O(n)
     */
    private int withHashMap(String s){

        Map<Character, Integer> map = new HashMap<>();
        int left = 0 , countMax = 0;

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c , right);
            countMax = Math.max(countMax, right-left+1);
        }
        return countMax;
    }

    /**Version 2 - basic sliding window using hash set
     * time complexity: O(n)
     */
    private int withHashSet(String s){
    
        int left = 0, countMax = 0;
          
        Set<Character>set = new HashSet<>();

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left = left + 1;
            }

            set.add(c);
            countMax = Math.max(countMax, right-left+1);

        }
        return countMax;
    }
}




