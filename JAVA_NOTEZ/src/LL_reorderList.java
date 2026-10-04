public class LL_reorderList {
    static void main(String[] args) {

    }
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        static void reorderList(Node head){
            Node slow = head;
            Node fast = head;

            // Find middle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node prev =null ;
            Node currrent = slow ;

            if(slow != null ){
                Node next = currrent.next ;
                currrent.next = prev ;

                prev = currrent ;
                currrent = next ;

            }
            Node first = head;
            slow = prev;

            while (slow != null) {
                Node firstNext = first.next;
                Node slowNext = slow.next;

                first.next = slow;
                slow.next = firstNext;

                first = firstNext;
                slow = slowNext;
            }
        }

        static void display(Node head) {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("END");
        }

    }

}