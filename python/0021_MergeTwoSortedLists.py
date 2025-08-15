# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
    
# Approach: Two Pointers + Dummy Head
#
# Plan:
# 1) Create a dummy node and a pointer `curr` to track the end of the merged list.
# 2) While both lists have nodes:
#      - Compare the current values of each list.
#      - Attach the smaller node to `curr.next` and move that list forward.
#      - Advance `curr`.
# 3) When one list is exhausted, connect `curr.next` to the remaining nodes of the other list.
# 4) Return `dummy.next` as the head of the merged sorted list.
#
# Time Complexity:  O(n + m) — each node is processed once.
# Space Complexity: O(1)     — merge is done in-place using existing nodes.

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(-1)
        curr = dummy
        while list1 and list2:
            if list1.val <= list2.val:
                curr.next = list1
                list1 = list1.next
            else:
                curr.next = list2
                list2 = list2.next
            curr = curr.next
        curr.next = list1 if list1 else list2
        return dummy.next
