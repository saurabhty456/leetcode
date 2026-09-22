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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
        {
            return null;
        }
        int r=preorder[0];
        int index=0;
        for(int i=0;i<preorder.length;i++)
        {
            if(preorder[0]==inorder[i])
            {
                index=i;
            }
        }
        TreeNode head=new TreeNode(r);
        head.left= buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));

        head.right= buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,preorder.length));
        
        return head;
    }
}