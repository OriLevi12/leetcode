# LeetCode Solutions – Ori Levi

This repository contains Java solutions to selected LeetCode problems.

## Problem Table

| #   | Title                                     | Level    | Solution File                                         | Approaches                     |
|-----|-------------------------------------------|----------|-------------------------------------------------------|-------------------------------|
| 1   | Two Sum                                   | 🟢 Easy   | [0001_TwoSum.java](java/0001_TwoSum.java)             | HashMap (2 versions)          |
| 3   | Longest Substring Without Repeating Chars | 🟡 Medium | [0003_LongestSubstringWithoutRepeating.java](java/0003_LongestSubstringWithoutRepeating.java) | Sliding Window, HashMap, HashSet |
| 200 | Number of Islands                         | 🟡 Medium | [0200_NumberOfIslands.java](java/0200_NumberOfIslands.java) | DFS (recursive)              |

---

## 🧩 Problem 1: Two Sum – Approaches

- `twoSumV1`: Standard one-pass with delayed `put` (recommended)
- `twoSumV2`: Starts from `i = 1`, pre-inserts `nums[0]` – works, but less flexible

---

## 🧩 Problem 200: Number of Islands – Approach

Solved using **Depth-First Search (DFS)** with recursion.

- ✅ Each time we find a `'1'`, we perform DFS to mark the entire island.
- ✅ We mark visited cells by changing `'1'` to `'0'` directly in the grid.
- ✅ We avoid using extra memory (like a visited matrix).

### 🔍 Time and Space Complexity

- **Time:** O(rows × cols) — we potentially visit every cell once.
- **Space:** O(rows × cols) in the worst case — due to the call stack depth if the entire grid is land.

### 🧠 Notes

- This is a classic grid traversal problem.
- BFS is also possible, but DFS is shorter and cleaner to implement recursively.
