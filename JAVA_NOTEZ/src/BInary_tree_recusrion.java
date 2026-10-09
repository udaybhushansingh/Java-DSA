import java.util.Scanner;

public class BInary_tree_recusrion {
    static void main(String[] args) {

        BInaryTree tree = new BInaryTree();

        tree.createTree();

        System.out.println("Root: " + tree.root.val);
    }

    static class Node {
        int val ;
        Node left ;
        Node right ;

        Node(int val){
            this.val = val;

        }
    }
    static class BInaryTree{
        Node root ;
        Scanner sc = new Scanner(System.in);


        void createTree() {
            root = populate() ;
        }

        Node populate(){
            System.out.println("Enter val:");
            int val = sc.nextInt();
            Node node = new Node(val) ;

            System.out.print("Add left child of " + val + "? (true/false): ");
            boolean left = sc.nextBoolean() ;
            if (left ){
                node.left = populate() ;
            }

            System.out.print("Add right child of " + val + "? (true/false): ");
            boolean right = sc.nextBoolean();
            if (right){
                node.right = populate() ;
            }

            return node;
        }

    }

}
