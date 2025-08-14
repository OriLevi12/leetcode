class Solution {
    // Short plan (plain English):
    // 1) If lengths differ -> false.
    // 2) Count letters for s, subtract for t.
    // 3) Verify all zero.
    // Time: O(n); Space: O(1) for 26 letters (O(k) for alphabet size).
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] cnt = new int[26];
        for (int i=0; i<s.length(); i++) cnt[s.charAt(i) - 'a']++;
        for (int i = 0; i<t.length(); i++){
            if (--cnt[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
