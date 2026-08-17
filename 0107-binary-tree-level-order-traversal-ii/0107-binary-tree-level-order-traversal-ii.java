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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>>adj=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                TreeNode n=q.poll();
                int v=n.val;
                list.add(v);
                if(n.right!=null)
                {
                    q.offer(n.right);
                }
                if(n.left!=null)
                {
                    q.offer(n.left);
                }
            }
            Collections.reverse(list);
            adj.add(list);
        }
        Collections.reverse(adj);
        return adj;
    }
}