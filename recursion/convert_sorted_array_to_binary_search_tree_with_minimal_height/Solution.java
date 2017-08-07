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
    public TreeNode sortedArrayToBST(int[] A) { 
      // write your code here
        if (A.length == 0){
            return null;
        }
        return buildTree(A,0,A.length-1);
    }
    public TreeNode buildTree(int[] A,int start,int end){
        if(start>end){
            return null;
        }
        int index = (start+end)/2;
        TreeNode treeNode = new TreeNode(A[index]);
        treeNode.left = buildTree(A,start,index-1);
        treeNode.right = buildTree(A,index+1,end);
        return treeNode;
    }
        
}
