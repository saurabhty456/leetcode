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
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return ans;
    }
    public void solve(TreeNode ro)
    {
        if(ro==null)
        {
            return;
        }
        int s=sum(ro);
        int si=size(ro);
        if(ro.val==s/si)
        {
            ans++;
        }
        solve(ro.left);
        solve(ro.right);
    }
    public int sum(TreeNode r)
    {
        if(r==null)
        {
            return 0;
        }
        return r.val+sum(r.left)+sum(r.right);
    }
    public int size(TreeNode r)
    {
        if(r==null)
        {
            return 0;
        }
        return 1+size(r.left)+size(r.right);
    }
}