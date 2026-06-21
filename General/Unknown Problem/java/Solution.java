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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode();
14        ListNode cur = dummy;
15        while (list1 != null && list2 != null) {
16            if (list1.val > list2.val) {
17                cur.next = list2;
18                list2 = list2.next;
19            } else {
20                cur.next = list1;
21                list1 = list1.next;
22            }
23            cur = cur.next;
24        }
25        cur.next = (list1 != null) ? list1 : list2;
26        return dummy.next;        
27    }
28}