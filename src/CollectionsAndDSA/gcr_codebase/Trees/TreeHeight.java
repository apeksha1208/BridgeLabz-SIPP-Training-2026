package Trees;
public class TreeHeight {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int height(TreeNode root) {

        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static boolean isTooDeep(TreeNode root, int threshold) {

        return height(root) > threshold;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        System.out.println("Height = " + height(root));

        System.out.println(isTooDeep(root, 2));
    }
}
