package BST;

public class BSTInsert {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode insert(TreeNode root, int val) {

        if (root == null)
            return new TreeNode(val);

        if (val < root.val)
            root.left = insert(root.left, val);

        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    public static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        System.out.print(root.val + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        insert(root, 40);

        inorder(root);
    }
}