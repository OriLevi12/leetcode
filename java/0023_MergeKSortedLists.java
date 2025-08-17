/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /**
 * Approach: Min-Heap (PriorityQueue)
 * - Push the head of each non-empty list into a min-heap.
 * - Repeatedly pop the smallest node, append it to the result list,
 *   and push its next node into the heap if it exists.
 * - Continue until the heap is empty.
 *
 * Time Complexity:  O(N log k)  (N = total nodes, k = number of lists)
 * Space Complexity: O(k)        (heap holds at most k nodes)
 */
 import java.util.PriorityQueue;
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min-heap that orders nodes by their value
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each non-empty list to the heap
        for (ListNode node : lists) {
            if (node != null) {
                heap.offer(node);
            }
        }

        // Dummy node to simplify result construction
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Build the merged list
        while (!heap.isEmpty()) {
            // Extract the smallest node
            ListNode node = heap.poll();
            // Attach it to the result list
            curr.next = node;
            curr = curr.next;

            // If the extracted node has a next, push it into the heap
            if (node.next != null) {
                heap.offer(node.next);
            }
        }

        // The merged list starts from dummy.next
        return dummy.next;
    }
}
    

