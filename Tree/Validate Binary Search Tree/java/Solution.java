/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        boolean d=false;
        if(root.left!=null && root.left.val<root.val)d=true;
        isValidBST(root.left);
        if(root.right!=null && root.right.val>=root.val)d=true;
        isValidBST(root.right);
        return d;
    }
}