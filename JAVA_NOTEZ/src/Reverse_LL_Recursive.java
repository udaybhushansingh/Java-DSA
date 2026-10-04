public class Reverse_LL_Recursive {
    static void main(String[] args) {

    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node reverseRec(Node head) {
        if(head==null && head.next == null ){
            return head;
        }


        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    //Reverse Linked List Iteratively.

    static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        while (current.next != null ){
            Node next= current.next ;
            current.next = prev ;

            prev = current;
            current = next;
        }
        return prev;

    }


    static Node reverseBetween(Node head, int left, int right){


        if (head == null || left == right) {
            return head;
        }
        Node dummy = new Node(0) ;
        dummy.next = head;
        Node before = dummy;

        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        Node current = before.next;

        for (int i = 0; i < right - left; i++) {
            Node next = current.next;
            current.next = next.next;
            next.next = before.next;

            before.next = next;
        }

        return dummy.next;



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
