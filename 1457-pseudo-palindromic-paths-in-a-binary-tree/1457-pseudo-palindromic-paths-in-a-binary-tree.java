
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
    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr=new int[10];
        helper(root,arr);
        return ans;
}
    void helper(TreeNode root,int[] arr)
    {
        if(root==null)
            return;
        arr[root.val]=arr[root.val]+1;
    
        if(root.left==null&&root.right==null)
        {
            if(isPali(arr))
                ans++;
        }
        helper(root.left,arr);
        helper(root.right,arr);
        arr[root.val]=arr[root.val]-11;
    }
    boolean isPali(int[]arr){
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
                odd++;
        }
        if(odd>=2)
            return false;
        return true;
    }
}