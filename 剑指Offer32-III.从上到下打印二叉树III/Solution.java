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
        for(int i=1; i<ans.size(); i+=2)
            Collections.reverse(ans.get(i));
        return ans;
    }

    public void level(TreeNode root, int depth) {
        if (root!=null) {
            if (ans.size() <= depth)
                ans.add(new ArrayList<>());

            ans.get(depth).add(root.val);
            level(root.left, depth+1);
            level(root.right, depth+1);
        }
    }
}