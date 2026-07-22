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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
         Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int levelsize=q.size();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode e=q.poll();
                if(i==0)
                {
                list.add(e.val);
                }
                if(e.right!=null)
                {
                    q.offer(e.right);
                }
                if(e.left!=null)
                {
                    q.offer(e.left);
                }
            }
        }
        return list;
    }
}