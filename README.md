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
| 42    | Trapping Rain Water                       | 🔴 Hard   | [0042_TrappingRainWater.java](java/0042_TrappingRainWater.java)   |                                                                      | Two Pointers                            |
| 49    | Group Anagrams                            | 🟡 Medium | [0049_GroupAnagrams.java](java/0049_groupAnagrams.java)           |                                                                      | HashMap, Char Sorting                   |
| 121   | Best Time to Buy and Sell Stock           | 🟢 Easy   | [0121_BestTimeToBuyAndSellStock.java](java/0121_BestTimeToBuyAndSellStock.java) | [0121_BestTimeToBuyAndSellStock.py](python/0121_BestTimeToBuyAndSellStock.py) | Single Pass, Min Price Tracking         |
| 128   | Longest Consecutive Sequence              | 🟡 Medium | [0128_LongestConsecutiveSequence.java](java/0128_LongestConsecutiveSequence.java) | [0128_LongestConsecutiveSequence.py](python/0128_LongestConsecutiveSequence.py) | HashSet, Start-of-Run Check             |
| 200   | Number of Islands                         | 🟡 Medium | [0200_NumberOfIslands.java](java/0200_NumberOfIslands.java)       |                                                                      | DFS (recursive)                         |
| 242   | Valid Anagram                             | 🟢 Easy   | [0242_ValidAnagram.java](java/0242_ValidAnagram.java)             | [0242_ValidAnagram.py](python/0242_ValidAnagram.py)                 | Count Array (O(n)), HashMap alternative |
| 347   | Top K Frequent Elements                   | 🟡 Medium | [0347_TopKFrequentElements.java](java/0347_TopKFrequentElements.java) |                                                                      | HashMap, Min Heap                       |
| 1004  | Max Consecutive Ones III                  | 🟡 Medium | [1004_MaxConsecutiveOnesIII.java](java/1004_MaxConsecutiveOnes3.java) |                                                                      | Sliding Window                          |

---

## 🧩 Problem 15: 3Sum – Approach

**Approach:** Sorting + Two Pointers  

**Complexity:**  
- ⏱ Time: O(n²) (sorting O(n log n) + two-pointer per anchor)  
- 📦 Space: O(1) extra (ignoring output)

---

## 🧩 Problem 242: Valid Anagram – Approach

**Approach:** Count Array (size 26) or HashMap  

**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1) for fixed alphabet (or O(k) for general Unicode)

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

## 🧩 Problem 1004: Max Consecutive Ones III – Approach

**Approach:** Sliding Window  

**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1)

---

## 🧩 Problem 347: Top K Frequent Elements – Approach

**Approach:** HashMap, Min Heap  

**Complexity:**  
- ⏱ Time: O(n log k)  
- 📦 Space: O(n)

---

## 🧩 Problem 42: Trapping Rain Water – Approach

**Approach:** Two Pointers with running left/right max  

**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(1)

---

## 🧩 Problem 1: Two Sum – Approaches

**Approach:** One-pass HashMap (recommended) or Pre-insert First Element  

**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(n)

---

## 🧩 Problem 20: Valid Parentheses – Approach

**Approach:** Stack, HashMap (matching pairs)  

**Complexity:**  
- ⏱ Time: O(n)  
- 📦 Space: O(n)

---

## 🧩 Problem 49: Group Anagrams – Approach

**Approach:** HashMap keyed by sorted-character signature  

**Complexity:**  
- ⏱ Time: O(n × k log k)  
- 📦 Space: O(n × k)

---

## 🧩 Problem 200: Number of Islands – Approach

**Approach:** DFS (recursive) to mark visited land  

**Complexity:**  
- ⏱ Time: O(rows × cols)  
- 📦 Space: O(rows × cols) recursion stack (worst-case)
