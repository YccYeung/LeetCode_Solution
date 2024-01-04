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

        // calls maxDepth for the left subtree and adds 1 to the result
        int left = maxDepth(root.left) + 1;
        // calls maxDepth for the right subtree and adds 1 to the result
        int right = maxDepth(root.right) + 1;

        // compare the depth of left and right subtree and return the larger one
        if (right > left) {
            return right;
        }
        return left;
    }
}
