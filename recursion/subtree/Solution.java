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
    /*
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */
    boolean flag;
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
      // write your code here
        if(T2==null){
            return true;
        }
        if(T1==null){
            return false;
        }
        //如果左边节点的值等于右边节点 就开始比较
       
        return compare(T1, T2)||isSubtree(T1.left, T2)||isSubtree(T1.right, T2);
    }
    public boolean  compare(TreeNode T1, TreeNode T2){
        if(T1==null){
            return T2==null;
        }
        if(T2==null){
            return false;
        }
        return (T1.val==T2.val)&&compare(T1.left, T2.left)&&compare(T1.right, T2.right);
    }
    
};
