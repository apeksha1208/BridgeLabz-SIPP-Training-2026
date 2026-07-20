package Trees;

import java.util.*;

public class RecursiveInorder {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void inorder(TreeNode root, List<Integer> list) {

        if (root == null)
            return;

        inorder(root.left, list);

        list.add(root.val);

        inorder(root.right, list);
    }

    public static List<Integer> getSortedLeaderboard(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(getSortedLeaderboard(root));
    }
}