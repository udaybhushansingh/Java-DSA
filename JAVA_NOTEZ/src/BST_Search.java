public class BST_Search {

    public static void main(String[] args) {

        BST_Search tree = new BST_Search();

        // Insert values
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(4);

        // Inorder
        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        // Search
        System.out.println("Found 6: " + tree.search(tree.root, 6));
        System.out.println("Found 4: " + tree.search(tree.root, 4));
        System.out.println("Found 7: " + tree.search(tree.root, 7));
    }

    // Node
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    // Insert wrapper
    void insert(int value) {
        root = insert(root, value);
    }

    // Recursive insert
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

    // Search
    boolean search(Node node, int value) {

        if (node == null) {
            return false;
        }

        if (value == node.value) {
            return true;
        }

        if (value < node.value) {
            return search(node.left, value);
        }

        return search(node.right, value);
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