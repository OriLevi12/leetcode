# LeetCode Solutions – Ori Levi

This repository contains **Java** and **Python** solutions to selected LeetCode problems, each with a short explanation, approach, and complexity analysis.

---

## 📋 Problem Table

| #     | Title                                     | Level    | Java Solution File                                               | Python Solution File                                               | Approaches                              |
|-------|-------------------------------------------|----------|------------------------------------------------------------------|----------------------------------------------------------------------|-----------------------------------------|
| 1     | Two Sum                                   | 🟢 Easy   | [0001_TwoSum.java](java/0001_TwoSum.java)                         |                                                                      | HashMap (2 versions)                    |
| 3     | Longest Substring Without Repeating Chars | 🟡 Medium | [0003_LongestSubstringWithoutRepeating.java](java/0003_LongestSubstringWithoutRepeating.java) |                                                                      | Sliding Window, HashMap, HashSet        |
| 20    | Valid Parentheses                         | 🟢 Easy   | [0020_ValidParentheses.java](java/0020_ValidParentheses.java)     |                                                                      | Stack, HashMap                          |
| 42    | Trapping Rain Water                       | 🔴 Hard   | [0042_TrappingRainWater.java](java/0042_TrappingRainWater.java)   |                                                                      | Two Pointers                            |
| 49    | Group Anagrams                            | 🟡 Medium | [0049_GroupAnagrams.java](java/0049_groupAnagrams.java)           |                                                                      | HashMap, Char Sorting                   |
| 121   | Best Time to Buy and Sell Stock           | 🟢 Easy   | [0121_BestTimeToBuyAndSellStock.java](java/0121_BestTimeToBuyAndSellStock.java) | [0121_BestTimeToBuyAndSellStock.py](python/0121_BestTimeToBuyAndSellStock.py) | Single Pass, Min Tracking               |
| 200   | Number of Islands                         | 🟡 Medium | [0200_NumberOfIslands.java](java/0200_NumberOfIslands.java)       |                                                                      | DFS (recursive)                         |
| 242   | Valid Anagram                             | 🟢 Easy   | [0242_ValidAnagram.java](java/0242_ValidAnagram.java)             | [0242_ValidAnagram.py](python/0242_ValidAnagram.py)                 | Count Array (O(n)), HashMap alternative |
| 347   | Top K Frequent Elements                   | 🟡 Medium | [0347_TopKFrequentElements.java](java/0347_TopKFrequentElements.java) |                                                                      | HashMap, Min Heap                        |
| 1004  | Max Consecutive Ones III                  | 🟡 Medium | [1004_MaxConsecutiveOnesIII.java](java/1004_MaxConsecutiveOnes3.java) |                                                                      | Sliding Window                           |

---

## 🧩 Problem 242: Valid Anagram – Approach

**Short plan (plain English):**
1. If lengths differ → return false.  
2. Count each letter from `s` into an array of size 26.  
3. Subtract counts using each letter from `t`.  
4. If any count < 0 or != 0 at the end → return false, else true.

**Complexity:**
- ⏱ Time: O(n) — one pass over each string.
- 📦 Space: O(1) — fixed array size for a-z (O(k) for alphabet size).

---

## 🧩 Problem 121: Best Time to Buy and Sell Stock – Approach

**Short plan (plain English):**
1. Track the smallest price seen so far (`minPrice`).
2. For each price, calculate potential profit if selling today: `price - minPrice`.
3. Update the best profit if this profit is higher.
4. Return the best profit (or 0 if no profit possible).

**Complexity:**
- ⏱ Time: O(n) — single pass
- 📦 Space: O(1) — constant memory

---

## 🧩 Problem 1004: Max Consecutive Ones III – Approach

Uses the **Sliding Window** technique to maintain the longest subarray containing at most `k` zeroes.

- Expand the right end of the window.
- If the number of 0's in the window exceeds `k`, move the left end to shrink it.
- Track the maximum window size.

**Complexity:**
- ⏱ Time: O(n)
- 📦 Space: O(1)

---

## 🧩 Problem 347: Top K Frequent Elements – Approach

Uses **HashMap** to count frequency and a **Min Heap** to keep track of the `k` most frequent elements.

- Count frequency of each element with a HashMap.
- Use a Min Heap (priority queue) of size `k`.
- For each entry:
  - Add to heap if size < k.
  - If frequency is higher than the smallest in the heap, replace.
- Extract the result from the heap.

**Complexity:**
- ⏱ Time: O(n log k)
- 📦 Space: O(n)

---

## 🧩 Problem 42: Trapping Rain Water – Approach

Uses the **Two Pointers** technique to efficiently compute trapped water.

- Initialize two pointers at the ends of the array.
- Move inward from the side with the lower bar.
- At each step, calculate trapped water based on the highest bar seen so far from that side.

**Complexity:**
- ⏱ Time: O(n)
- 📦 Space: O(1)

---

## 🧩 Problem 1: Two Sum – Approaches

- **Version 1 (recommended)**: One-pass HashMap with delayed `put`.
- **Version 2**: Start from `i = 1`, pre-insert `nums[0]` (works but less flexible).

---

## 🧩 Problem 20: Valid Parentheses – Approach

Uses `Stack` for tracking opening brackets and `HashMap` to match closing brackets.

- Push opening brackets to stack.
- For closing brackets, check if they match the top.
- If stack is empty at the end → valid.

**Complexity:**
- ⏱ Time: O(n)
- 📦 Space: O(n)

---

## 🧩 Problem 49: Group Anagrams – Approach

Groups words by their sorted character signature using a `HashMap`.

- Convert each word to a sorted char array → use it as a map key.
- Add each word to its corresponding anagram group.

**Complexity:**
- ⏱ Time: O(n × k log k) — sorting each word
- 📦 Space: O(n × k) — storing all words and keys  
(n = #words, k = avg word length)

---

## 🧩 Problem 200: Number of Islands – Approach

Uses recursive DFS to mark visited land.

- For each `'1'`, run DFS and mark as `'0'`.
- Counts total number of islands.

**Complexity:**
- ⏱ Time: O(rows × cols)
- 📦 Space: O(rows × cols) — recursion stack in worst case
