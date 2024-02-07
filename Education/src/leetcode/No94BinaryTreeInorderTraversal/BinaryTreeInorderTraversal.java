package leetcode.No94BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        if (root.left != null) inorderTraversal(root.left, list);
        if (root.right != null) inorderTraversal(root.right, list);
        return list;
    }

    public static void inorderTraversal(TreeNode node, List<Integer> list){
        list.add(node.val);
        if (node.left != null) inorderTraversal(node.left, list);
        if (node.right != null) inorderTraversal(node.right, list);
    }
}
