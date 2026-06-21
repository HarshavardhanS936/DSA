1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode a=headA,b=headB;
15        while(a != b){
16            if(a==null) a=headB;
17            else a=a.next;
18            if(b==null)b=headA;
19            else b=b.next;
20        }
21        return a;
22    }
23}