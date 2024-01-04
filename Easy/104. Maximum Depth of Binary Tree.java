class Solution {
    public int maxDepth(TreeNode root) {
        
        // base case 1
        if (root == null) {
            return 0;
        }
        // base case 2
        if (root.left == null && root.right == null) {
            return 1;
        }

        // recursive case 
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;

        if (right > left) {
            return right;
        }
        return left;
    }
}
