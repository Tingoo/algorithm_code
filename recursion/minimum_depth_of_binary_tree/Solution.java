/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code 
        if(root==null){
            return 0;
        }
        return getMinDepth(root);
    }
    public int getMinDepth(TreeNode root){
        if(root.left==null&&root.right==null){
            return 1;
        }else if(root.left==null){
            return getMinDepth(root.right)+1;
        }else if(root.right==null){
            return getMinDepth(root.left)+1;
        } 
        return Math.min(getMinDepth(root.left),getMinDepth(root.right))+1;
    } 
}
