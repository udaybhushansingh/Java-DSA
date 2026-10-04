public class LL_Node_K_reverse {
    public static void main(String[] args) {

    }

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node reverseKGroup(Node head, int k) {
        Node current = head;

        Node temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }

        Node prev = null;
        for (int i = 0; i < k; i++) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = reverseKGroup(current, k);

        return prev;
    }


    static void display(LL_reorderList.Node head) {

        LL_reorderList.Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}


