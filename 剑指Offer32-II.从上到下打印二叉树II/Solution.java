/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        level(root, 0);
        return ans;
    }

    public void level(TreeNode root, int depth) {
        if (root!=null) {
            //depth和depth之前的层
            if (ans.size() <= depth)
                ans.add(new ArrayList());

            ans.get(depth).add(root.val);

            level(root.left, depth+1);
            level(root.right, depth+1);
        }
    }
}