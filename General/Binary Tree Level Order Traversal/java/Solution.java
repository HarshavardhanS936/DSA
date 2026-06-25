1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> list=new ArrayList<>();
19        if(root==null)return list;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.offer(root);
22        while(!q.isEmpty()){
23            List<Integer> list1=new ArrayList<>();
24            int size=q.size();
25            for(int i=0;i<size;i++){
26                TreeNode node=q.poll();
27                list1.add(node.val);
28                if(node.left!=null)q.offer(node.left);
29                if(node.right!=null)q.offer(node.right);
30            }
31            list.add(list1);
32        }
33        return list;
34    }
35}