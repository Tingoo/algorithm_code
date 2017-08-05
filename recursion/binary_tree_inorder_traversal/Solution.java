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
    ArrayList<Integer> arrs = new ArrayList<>();
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if(root==null){
        	return arrs;
        }
        	inorderTraversal(root.left);
        	arrs.add(root.val);
        	inorderTraversal(root.right);
        	return arrs;
    }
}
