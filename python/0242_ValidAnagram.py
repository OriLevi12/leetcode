def isAnagram(s: str, t: str) -> bool:
    # Short plan (plain English):
    # 1) If lengths differ -> false.
    # 2) Count letters in s, subtract for t.
    # 3) If any count != 0 -> false; else true.
    # Time: O(n), Space: O(1) for 26 letters (or O(k) for alphabet size).
    if len(s) != len(t):
        return False
    count = [0] * 26
    base = ord('a')
    for ch in s:
        count[ord(ch) - base] += 1
    for ch in t:
        i = ord(ch) - base
        count[i] -= 1
        if count[i] < 0:
            return False
    return all(c == 0 for c in count)
