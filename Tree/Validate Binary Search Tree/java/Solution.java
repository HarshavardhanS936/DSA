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
    TreeNode pre=null;
    public boolean inOrder(TreeNode root){
        if(root==null)return true;
        if(!inOrder(root.left))return false;
        if(pre!=null && root.val<=pre.val) return false;
        pre=root;
        return inOrder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }
}