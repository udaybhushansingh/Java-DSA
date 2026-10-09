public class BIinary_Tree {


        public static void main(String[] args) {

            // Create the root
            Node root = new Node(1);

            // Create children
            root.left = new Node(2);
            root.right = new Node(3);

            // Create children of 2
            root.left.left = new Node(4);
            root.left.right = new Node(5);

            // Display
            System.out.println("Root: " + root.val);
            System.out.println("Left of Root: " + root.left.val);
            System.out.println("Right of Root: " + root.right.val);
            System.out.println("Left of 2: " + root.left.left.val);
            System.out.println("Right of 2: " + root.left.right.val);
        }

        static class Node {
            int val;
            Node left;
            Node right;

            Node(int val) {
                this.val = val;
            }
        }
    }