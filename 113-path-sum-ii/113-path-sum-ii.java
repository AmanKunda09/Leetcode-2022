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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,targetSum,ans,new ArrayList<>());
        return ans;
    }
    public void helper(TreeNode root, int targetSum,List<List<Integer>> ans,List<Integer> temp)
    {
        if(root==null) return;
        temp.add(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0)
        {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        helper(root.left,targetSum-root.val,ans,temp);
        if(root.left!=null)
            temp.remove(temp.size()-1);
        helper(root.right,targetSum-root.val,ans,temp);
        if(root.right!=null)
            temp.remove(temp.size()-1);
    }
}