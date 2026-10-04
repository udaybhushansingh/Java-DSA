public class Recursive_nsertion {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insertRec(Node node, int val, int index) {

        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }

        node.next = insertRec(node.next, val, index - 1);

        return node;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        display(head);

        head = insertRec(head, 99, 2);

        display(head);
    }
}