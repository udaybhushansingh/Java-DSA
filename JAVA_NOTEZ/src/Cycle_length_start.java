public class Cycle_length_start {
    static void main(String[] args) {

    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static int cycleLength(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = 0;
                return length;
            }

        }


        return 0;
    }
}


