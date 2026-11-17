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

class Solution {
    public ListNode reverseList(ListNode head) {
        // 0 -> 1 -> 2 -> 3
        Deque<ListNode> stack = new ArrayDeque<>();

        ListNode current = head;
        while(current != null){
            stack.push(current);
            current = current.next;
        }
        if(stack.isEmpty()){
            return null;
        }

        head = stack.pop();
        ListNode node_current = head;
        while(!stack.isEmpty()){
            node_current.next = stack.pop();
            node_current = node_current.next;
        }
        node_current.next = null;
        return head;
    }
}
