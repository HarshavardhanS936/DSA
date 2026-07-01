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
12    public int numComponents(ListNode head, int[] nums) {
13        HashSet<Integer> set=new HashSet<>();
14        int a=0;
15        for(int x:nums)set.add(x);
16        while(head!=null){
17            if(set.contains(head.val) && (head.next==null || !set.contains(head.next.val)))a++;
18            head=head.next;
19        }
20        return a;
21    }
22}