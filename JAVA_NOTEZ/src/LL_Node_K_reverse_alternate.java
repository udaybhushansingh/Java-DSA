public class LL_Node_K_reverse_alternate {
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
        // Skip next k nodes
        temp = current;

        for (int i = 1; i < k && temp != null; i++) {
            temp = temp.next;
        }

        // Reverse the next k nodes recursively
        if (temp != null) {
            temp.next = reverseKGroup(temp.next, k);
        }

        return temp;
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
