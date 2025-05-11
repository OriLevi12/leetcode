# LeetCode Solutions – Ori Levi

This repository contains Java solutions to selected LeetCode problems.

## Problem Table

| #   | Title                                     | Level    | Solution File                                         | Approaches                     |
|-----|-------------------------------------------|----------|-------------------------------------------------------|-------------------------------|
| 1   | Two Sum                                   | 🟢 Easy   | [0001_TwoSum.java](java/0001_TwoSum.java)             | HashMap (2 versions)          |
| 3   | Longest Substring Without Repeating Chars | 🟡 Medium | [0003_LongestSubstringWithoutRepeating.java](java/0003_LongestSubstringWithoutRepeating.java) | Sliding Window, HashMap, HashSet |
| 20  | Valid Parentheses                         | 🟢 Easy   | [0020_ValidParentheses.java](java/0020_ValidParentheses.java) | Stack, HashMap               |
| 49  | Group Anagrams                            | 🟡 Medium | [0049_GroupAnagrams.java](java/0049_GroupAnagrams.java) | HashMap, Char Sorting        |
| 200 | Number of Islands                         | 🟡 Medium | [0200_NumberOfIslands.java](java/0200_NumberOfIslands.java) | DFS (recursive)              |

---

## 🧩 Problem 1: Two Sum – Approaches

- `twoSumV1`: Standard one-pass with delayed `put` (recommended)
- `twoSumV2`: Starts from `i = 1`, pre-inserts `nums[0]` – works, but less flexible

---

## 🧩 Problem 20: Valid Parentheses – Approach

Uses `Stack` for tracking opening brackets and `HashMap` to match closing brackets.

- Push opening brackets to stack.
- For closing brackets, check if they match the top.
- If stack is empty at the end → valid.

⏱ O(n) time, O(n) space.

---

## 🧩 Problem 49: Group Anagrams – Approach

Groups words by their sorted character signature using a `HashMap`.

- Convert each word to a sorted char array → use it as a map key.
- Add each word to its corresponding anagram group.

⏱ Time: O(n × k log k) — for sorting each word  
📦 Space: O(n × k) — storing all words and keys (n = #words, k = avg word length)

---

## 🧩 Problem 200: Number of Islands – Approach

Uses recursive DFS to mark visited land.

- For each `'1'`, run DFS and mark as `'0'`.
- Counts total number of islands.

⏱ O(rows × cols) time  
🧠 Space: O(rows × cols) in worst case due to recursion stack
