# LeetCode Solutions – Ori Levi

This repository contains Java solutions to selected LeetCode problems.

## Problem Table

| #   | Title                                     | Level    | Solution File                                         | Approaches                     |
|-----|-------------------------------------------|----------|-------------------------------------------------------|-------------------------------|
| 1   | Two Sum                                   | 🟢 Easy   | [0001_TwoSum.java](java/0001_TwoSum.java)             | HashMap (2 versions)          |
| 3   | Longest Substring Without Repeating Chars | 🟡 Medium | [0003_LongestSubstringWithoutRepeating.java](java/0003_LongestSubstringWithoutRepeating.java) | Sliding Window, HashMap, HashSet |

---

## 🧩 Problem 1: Two Sum – Approaches

- `twoSumV1`: Standard one-pass with delayed `put` (recommended)
- `twoSumV2`: Starts from `i = 1`, pre-inserts `nums[0]` – works, but less flexible
