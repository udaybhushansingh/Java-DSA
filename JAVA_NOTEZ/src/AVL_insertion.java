public class AVL_insertion {

    public static void main(String[] args) {

        AVL_Tree tree = new AVL_Tree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(2);

        tree.insert(11);
        tree.insert(3);
        tree.insert(7);


        System.out.print("Inorder: ");
        tree.inorder(tree.root);
    }
}

    class AVL_Tree {

        static class Node {
            int value;
            int height;

            Node left;
            Node right;

            Node(int value) {
                this.value = value;
                this.height = 1;
            }
        }

        Node root;

        // Get height
        int height(Node node) {
            if (node == null) {
                return 0;
            }

            return node.height;
        }

        // Get balance factor
        int getBalance(Node node) {
            if (node == null) {
                return 0;
            }

            return height(node.left) - height(node.right);
        }

        // Insert into AVL
        void insert(int value) {
            root = insert(root, value);
        }

        Node insert(Node node, int value) {

            // Normal BST insertion
            if (node == null) {
                return new Node(value);
            }

            if (value < node.value) {
                node.left = insert(node.left, value);
            } else if (value > node.value) {
                node.right = insert(node.right, value);
            } else {
                return node;
            }

            // Update height
            node.height = 1 + Math.max(
                    height(node.left),
                    height(node.right)
            );

            // Check balance
            int balance = getBalance(node);

            // LL Case
            if (balance > 1 && value < node.left.value) {
                return rightRotate(node);
            }

            // RR Case
            if (balance < -1 && value > node.right.value) {
                return leftRotate(node);
            }

            // LR Case
            if (balance > 1 && value > node.left.value) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

            // RL Case
            if (balance < -1 && value < node.right.value) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

            return node;
        }

        // Right Rotation
        Node rightRotate(Node y) {

            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2;

            // Update heights
            y.height = 1 + Math.max(
                    height(y.left),
                    height(y.right)
            );

            x.height = 1 + Math.max(
                    height(x.left),
                    height(x.right)
            );

            return x;
        }

        // Left Rotation
        Node leftRotate(Node x) {

            Node y = x.right;
            Node T2 = y.left;

            y.left = x;
            x.right = T2;

            // Update heights
            x.height = 1 + Math.max(
                    height(x.left),
                    height(x.right)
            );

            y.height = 1 + Math.max(
                    height(y.left),
                    height(y.right)
            );

            return y;
        }

        // Inorder
        void inorder(Node node) {

            if (node == null) {
                return;
            }

            inorder(node.left);

            System.out.print(node.value + " ");

            inorder(node.right);
        }

    }
