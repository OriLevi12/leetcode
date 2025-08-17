# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

"""
Approach: Min-Heap (PriorityQueue)
- Push the head of each non-empty list into a min-heap.
- Repeatedly pop the smallest node, append it to the result list,
  and push its next node into the heap if it exists.
- Continue until the heap is empty.

Time Complexity:  O(N log k)  (N = total nodes, k = number of lists)
Space Complexity: O(k)        (heap holds at most k nodes)
"""

from typing import List, Optional
from heapq import heappush, heappop
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []

        # Add the head of each non-empty list into the heap
        for i, node in enumerate(lists):
            if node:
                # (value, index, node) — index prevents comparison error when values are equal
                heappush(heap, (node.val, i, node))

        dummy = ListNode(0)
        curr = dummy

        # Build the merged sorted list
        while heap:
            val, i, node = heappop(heap)  # Extract the smallest node
            curr.next = node              # Append it to the result list
            curr = curr.next

            if node.next:                 # If there is a next node, push it to the heap
                heappush(heap, (node.next.val, i, node.next))

        return dummy.next
