package BST;

public class LowestCommonAncestorBST {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {

        TreeNode current = root;

        while (current != null) {

            if (p < current.val && q < current.val)

                current = current.left;

            else if (p > current.val && q > current.val)

                current = current.right;

            else

                return current;
        }

        return null;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode ans = lowestCommonAncestor(root, 2, 4);

        System.out.println(ans.val);
    }
}