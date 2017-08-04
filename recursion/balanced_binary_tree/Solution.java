/**
 *  17.8.4 递归：平衡二叉树 
 * http://www.lintcode.com/zh-cn/problem/balanced-binary-tree/
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

    int heightLeft = 0;
    int heightRight = 0;
    int count = 0;
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null) {
            return true;
        }
        heightLeft = getHeight(root.left);
        heightRight = getHeight(root.right);
        diff = Math.abs(heightLeft[] - heightRight);

        if (diff > 1) {
            return false;
        } else {
            return (isBalanced(root.right) && isBalanced(root.left));
        }
    }
    public int getHeight(TreeNode tree) {
        if (tree == null) {
            return 0;
        } else {
            return Math.max(getHeight(tree.left), getHeight(tree.right)) + 1;
        }

    }
}
