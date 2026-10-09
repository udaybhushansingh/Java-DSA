import java.util.Queue;
import java.util.LinkedList;

class Binary_T_Level_Order_Traversal{

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Create tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.levelOrder(tree.root);
    }

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static class BinaryTree {

        Node root;

        public void levelOrder(Node root) {

            Queue<Node> queue = new LinkedList<>();

            // Add root first
            queue.add(root);

            while (!queue.isEmpty()) {

                Node node = queue.remove();

                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
}