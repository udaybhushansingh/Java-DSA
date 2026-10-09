public class BST {

    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
    }

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    // Insert into BST
    void insert(int value) {
        root = insert(root, value);
    }

    Node insert(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    // Inorder: Left → Root → Right
    void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.value + " ");

        inorder(node.right);
    }
}