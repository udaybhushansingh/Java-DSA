public class Binary_tree_2 {
    static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree();

        System.out.println("Root: " + tree.root.val);
        System.out.println("Root left: " + tree.root.left.val);
        System.out.println("Root right: " + tree.root.right.val);
        System.out.println("Root left: " + tree.root.left.left.val);



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

        void createTree() {
            root = new Node(1);

            root.left = new Node(2);
            root.right = new Node(3);

            root.left.left = new Node(4);
            root.left.right = new Node(5);
        }
    }
}
