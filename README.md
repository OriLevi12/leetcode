# LeetCode Solutions – Ori Levi

This repository contains **Java** and **Python** solutions to selected LeetCode problems, each with a short explanation, approach, and complexity analysis.

---

## 📋 Problem Table

| #     | Title                                     | Level    | Java Solution File                                               | Python Solution File                                               | Approaches                              |
|-------|-------------------------------------------|----------|------------------------------------------------------------------|----------------------------------------------------------------------|-----------------------------------------|
| 1     | Two Sum                                   | 🟢 Easy   | [0001_TwoSum.java](java/0001_TwoSum.java)                         |                                                                      | HashMap (2 versions)                    |
| 3     | Longest Substring Without Repeating Chars | 🟡 Medium | [0003_LongestSubstringWithoutRepeating.java](java/0003_LongestSubstringWithoutRepeating.java) |                                                                      | Sliding Window, HashMap, HashSet        |
| 15    | 3Sum                                      | 🟡 Medium | [0015_3Sum.java](java/0015_3Sum.java)                             | [0015_3Sum.py](python/0015_3Sum.py)                                 | Sorting + Two Pointers                  |
| 20    | Valid Parentheses                         | 🟢 Easy   | [0020_ValidParentheses.java](java/0020_ValidParentheses.java)     |                                                                      | Stack, HashMap                          |
| 21    | Merge Two Sorted Lists                    | 🟢 Easy   | [0021_MergeTwoSortedLists.java](java/0021_MergeTwoSortedLists.java) | [0021_MergeTwoSortedLists.py](python/0021_MergeTwoSortedLists.py)   | Linked List, Two Pointers, Dummy Head   |
| 23    | Merge k Sorted Lists                      | 🔴 Hard   | [0023_MergeKSortedLists.java](java/0023_MergeKSortedLists.java)   | [0023_MergeKSortedLists.py](python/0023_MergeKSortedLists.py)       | Min Heap (PriorityQueue)                |
| 33    | Search in Rotated Sorted Array            | 🟡 Medium | [0033_SearchInRotatedSortedArray.java](java/0033_SearchInRotatedSortedArray.java) | [0033_SearchInRotatedSortedArray.py](python/0033_SearchInRotatedSortedArray.py) | Binary Search (check sorted half)       |
| 42    | Trapping Rain Water                       | 🔴 Hard   | [0042_TrappingRainWater.java](java/0042_TrappingRainWater.java)   |                                                                      | Two Pointers                            |
| 49    | Group Anagrams                            | 🟡 Medium | [0049_GroupAnagrams.java](java/0049_groupAnagrams.java)           |                                                                      | HashMap, Char Sorting                   |
| 91    | Decode Ways                               | 🟡 Medium | [0091_DecodeWays.java](java/0091_DecodeWays.java)                 | [0091_DecodeWays.py](python/0091_DecodeWays.py)                     | Dynamic Programming (DP Array + Rolling)|
| 121   | Best Time to Buy and Sell Stock           | 🟢 Easy   | [0121_BestTimeToBuyAndSellStock.java](java/0121_BestTimeToBuyAndSellStock.java) | [0121_BestTimeToBuyAndSellStock.py](python/0121_BestTimeToBuyAndSellStock.py) | Single Pass, Min Price Tracking         |
| 128   | Longest Consecutive Sequence              | 🟡 Medium | [0128_LongestConsecutiveSequence.java](java/0128_LongestConsecutiveSequence.java) | [0128_LongestConsecutiveSequence.py](python/0128_LongestConsecutiveSequence.py) | HashSet, Start-of-Run Check             |
| 200   | Number of Islands                         | 🟡 Medium | [0200_NumberOfIslands.java](java/0200_NumberOfIslands.java)       |                                                                      | DFS (recursive)                         |
| 242   | Valid Anagram                             | 🟢 Easy   | [0242_ValidAnagram.java](java/0242_ValidAnagram.java)             | [0242_ValidAnagram.py](python/0242_ValidAnagram.py)                 | Count Array (O(n)), HashMap alternative |
| 347   | Top K Frequent Elements                   | 🟡 Medium | [0347_TopKFrequentElements.java](java/0347_TopKFrequentElements.java) |                                                                      | HashMap, Min Heap                       |
| 1004  | Max Consecutive Ones III                  | 🟡 Medium | [1004_MaxConsecutiveOnesIII.java](java/1004_MaxConsecutiveOnes3.java) |                                                                      | Sliding Window                          |

---

## 🧩 Problem 1: Two Sum – Approaches

**Approach:** One-pass HashMap (recommended) or Pre-insert First Element  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(n)

---

## 🧩 Problem 3: Longest Substring Without Repeating Characters – Approach

**Approach:** Sliding Window, HashMap, HashSet  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(min(n, k))

---

## 🧩 Problem 15: 3Sum – Approach

**Approach:** Sorting + Two Pointers  
**Complexity:**  
- ⏱ Time: O(n²) (sorting O(n log n) + two-pointer per anchor)  
- 📦 Space: O(1) extra (ignoring output)

---

## 🧩 Problem 20: Valid Parentheses – Approach

**Approach:** Stack, HashMap (matching pairs)  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(n)

---

## 🧩 Problem 21: Merge Two Sorted Lists – Approach

**Approach:** Linked List, Two Pointers + Dummy Head  
**Complexity:**  
- ⏱ Time: O(n + m) — each node is processed once.  
- 📦 Space: O(1) — merge is done in-place using existing nodes.

---

## 🧩 Problem 23: Merge k Sorted Lists – Approach

**Approach:** Min-Heap (PriorityQueue)  
- Push all non-null list heads to a min-heap.  
- Pop smallest element, append it to result, and push its next (if exists).  
**Complexity:**  
- ⏱ Time: O(N log k), where N = total nodes and k = number of lists  
- 📦 Space: O(k) for the heap

---

## 🧩 Problem 33: Search in Rotated Sorted Array – Approach

**Approach:** Binary Search with “which half is sorted” check  
- At each step, one half (left or right) is guaranteed sorted.  
- Decide if target lies in the sorted half → shrink search range accordingly.  
**Complexity:**  
- ⏱ Time: O(log n)  
- 📦 Space: O(1)

---

## 🧩 Problem 42: Trapping Rain Water – Approach

**Approach:** Two Pointers with running left/right max  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1)

---

## 🧩 Problem 49: Group Anagrams – Approach

**Approach:** HashMap keyed by sorted-character signature  
**Complexity:**  
- ⏱ Time: O(n × k log k)  
- 📦 Space: O(n × k)

---

## 🧩 Problem 91: Decode Ways – Approach

**Approach:** Dynamic Programming  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(n) or O(1) with rolling variables

---

## 🧩 Problem 121: Best Time to Buy and Sell Stock – Approach

**Approach:** Single Pass, Min Price Tracking  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1)

---

## 🧩 Problem 128: Longest Consecutive Sequence – Approach

**Approach:** HashSet, Start-of-Run Check  
**Complexity:**  
- ⏱ Time: O(n) average (each number visited at most twice)  
- 📦 Space: O(n) for the set

---

## 🧩 Problem 200: Number of Islands – Approach

**Approach:** DFS (recursive) to mark visited land  
**Complexity:**  
- ⏱ Time: O(rows × cols)  
- 📦 Space: O(rows × cols) recursion stack (worst-case)

---

## 🧩 Problem 242: Valid Anagram – Approach

**Approach:** Count Array (size 26) or HashMap  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1) for fixed alphabet (or O(k) for general Unicode)

---

## 🧩 Problem 347: Top K Frequent Elements – Approach

**Approach:** HashMap, Min Heap  
**Complexity:**  
- ⏱ Time: O(n log k)  
- 📦 Space: O(n)

---

## 🧩 Problem 1004: Max Consecutive Ones III – Approach

**Approach:** Sliding Window  
**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1)