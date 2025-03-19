package practice;

/**
 * // 用递归实现二叉树的三序遍历
 *
 * @author lx
 * @date 2025/3/19 11:40
 */
public class Practice_015_BinaryTreeTraversalRecursion {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int v) {
            val = v;
        }
    }

    //先序遍历 中左右
    public static void preOrder(TreeNode head){
        if (head==null) {
            return;
        }
        System.out.println(head.val+" ");
        preOrder(head.left);
        preOrder(head.right);
    }

    // 中序打印所有节点，递归版
    public static void inOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrder(head.left);
        System.out.print(head.val + " ");
        inOrder(head.right);
    }

    // 后序打印所有节点，递归版
    public static void posOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        posOrder(head.left);
        posOrder(head.right);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);

        preOrder(head);
        System.out.println();
        System.out.println("先序遍历递归版");

        inOrder(head);
        System.out.println();
        System.out.println("中序遍历递归版");

        posOrder(head);
        System.out.println();
        System.out.println("后序遍历递归版");

    }
}
