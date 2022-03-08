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
    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[0];
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        queue.add(root);
        TreeNode temp;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            res.add(temp.val);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        //将ArrayList转int
        int[] ans = new int[res.size()];
        for (int i=0; i<res.size(); i++)
            ans[i] = res.get(i);
        return ans;
    }
}