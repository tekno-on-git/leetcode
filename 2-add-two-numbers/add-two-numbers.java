/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode dh = new ListNode(-1);
		ListNode curNode = dh;
		int carry = 0;

		while(l1 != null || l2 != null || carry != 0){
			int val1 = (l1 == null) ? 0 : l1.val;
			int val2 = (l2 == null )? 0 : l2.val;

			int sum = val1 + val2 + carry;
			carry = sum /10;

			curNode.next = new ListNode(sum % 10);
			curNode = curNode.next;

			l1 = (l1 == null )? null : l1.next;
			l2 = (l2 == null)? null : l2.next;
		}
		ListNode res = dh.next;
		dh.next = null;
		return res;
	} 

}
