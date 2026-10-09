import java.util.Scanner;

public class B_Tree_Traversal_Preorder {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.createTree();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
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
        Scanner sc = new Scanner(System.in);

        // Recursive tree creation
        void createTree() {
            root = populate();
        }

        Node populate() {
            System.out.print("Enter value: ");
            int val = sc.nextInt();

            Node node = new Node(val);

            System.out.print("Add left child of " + val + "? (true/false): ");
            boolean left = sc.nextBoolean();

            if (left) {
                node.left = populate();
            }

            System.out.print("Add right child of " + val + "? (true/false): ");
            boolean right = sc.nextBoolean();

            if (right) {
                node.right = populate();
            }

            return node;
        }

        // Preorder: Root → Left → Right
        void preorder(Node node) {
            if (node == null) {
                return;
            }

            System.out.print(node.val + " ");

            preorder(node.left);
            preorder(node.right);
        }
    }
}
