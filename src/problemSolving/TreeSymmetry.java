package problemSolving;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class TreeSymmetry {

        public boolean checkSymmetry(TreeNode left, TreeNode right) {
            if(left == null && right == null)
                return true;
            if(left == null || right == null || left.val != right.val)
                return false;
            return left.val == right.val && checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);

        }

        public boolean isSymmetric(TreeNode root) {
            if(root == null)
                return false;
            return checkSymmetry(root.left, root.right);

        }

}
