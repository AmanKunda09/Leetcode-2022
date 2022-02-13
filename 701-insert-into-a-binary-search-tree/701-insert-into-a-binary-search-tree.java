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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode root2=root;
        TreeNode last=root;
        TreeNode node=new TreeNode(val);
        if(root==null)
            return node;
        while(root!=null)
        {
            last=root;
            root=val<root.val?root.left:root.right;
            
        }
        if(val<=last.val){
            
            last.left= node;
        }
        else{
            last.right=node;
        }
        return root2;
    }
}