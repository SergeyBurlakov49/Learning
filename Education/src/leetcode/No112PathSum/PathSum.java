package leetcode.No112PathSum;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root != null && (root.val == targetSum
//                || (root.left != null && hasPathSum(root.left, targetSum - root.val))
//                || (root.right != null && hasPathSum(root.right, targetSum - root.val)))) return true;
//        else return false;
        if (root == null) return false;
        if (isLeaf(root) && root.val == targetSum) return true;
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }

    public static boolean isLeaf(TreeNode treeNode){
        return (treeNode.left == null && treeNode.right == null);
    }

    public static void main(String[] args) {
        new PathSum().hasPathSum(new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4,null, new TreeNode(1)))), 22);
    }
}
