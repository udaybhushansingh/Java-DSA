public class Cycle_length {

        public static void main(String[] args) {

            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            // Create cycle: 5 → 3
            head.next.next.next.next.next = head.next.next;

            Node result = detectCycle(head);

            if (result != null) {
                System.out.println("Cycle starts at: " + result.val);
            } else {
                System.out.println("No cycle");
            }
        }

        static Node detectCycle(Node head) {

            Node slow = head;
            Node fast = head;

            // Step 1: Find meeting point
            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {

                    // Step 2: Find starting node
                    Node temp = head;

                    while (temp != slow) {
                        temp = temp.next;
                        slow = slow.next;
                    }

                    return temp;
                }
            }

            return null;
        }

        static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }
    }
