1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode fast = dummy;
16        ListNode slow = dummy;
17        for (int i = 0; i <= n; i++) {
18            fast = fast.next;
19        }
20        while (fast != null) {
21            fast = fast.next;
22            slow = slow.next;
23        }
24        slow.next = slow.next.next;
25        return dummy.next;
26    }
27    public static void printList(ListNode head) {
28        while (head != null) {
29            System.out.print(head.val + " ");
30            head = head.next;
31        }
32        System.out.println();
33    }
34}