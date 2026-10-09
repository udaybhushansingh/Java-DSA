import java.util.Scanner;

public interface B_Tree_Traversal_Inorder {
    static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.createTree();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
    }


    }

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }


    }

    class BinaryTree {
        Node root;

        Scanner sc = new Scanner(System.in);

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


            System.out.print("Add left child of " + val + "? (true/false): ");
            boolean right = sc.nextBoolean();

            if (right) {
                node.left = populate();
            }
            return node;

        }

        void postorder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.val + " ");
            postorder(node.left);
            postorder(node.right);

            System.out.print(node.val + " ");
        }

        void inorder(Node node) {
            if (node == null) {
                return;
            }

            inorder(node.left);

            System.out.print(node.val + " ");

            inorder(node.right);
        }

    }

