package Trees;

public class TreeDiameter {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int diameter = 0;

    public static int height(TreeNode root) {

        if (root == null)
            return -1;

        int left = height(root.left);

        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }

    public static int longestCommunicationPath(TreeNode root) {

        diameter = 0;

        height(root);

        return diameter;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(longestCommunicationPath(root));
    }
}