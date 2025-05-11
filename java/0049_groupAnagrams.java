import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    /**
     * Time complexity: O(n*klogk)
     * n = number of words
     * k = max length of a word
     * Reason: for each word, we sort the characters in the word, which takes O(klogk) time.
     * So the overall time complexity is O(n*klogk).
     * 
     * Space complexity: O(n*k)
     * Reason: we use a hash map to store the anagrams, which takes O(n*k) space.
     * @param strs array of input words
     * @return list of groups, where each group contains anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            //convert word to char array to sort its characters
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortWord = new String(chars); //create canonical form of the word like "aet" for "eat"
            //if we haven't seen this sorted word before, create a new list
            if(!map.containsKey(sortWord)){
                map.put(sortWord,new ArrayList<>());
            }
            //add the original word to its corresponding anagram group
            map.get(sortWord).add(word);
        }
            return new ArrayList<>(map.values());
    }
}
