public class SOrt_linkl {
    static void main(String[] args) {

    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        Node first = sortList(head);
        second = sortList(second);

        return merge(first, second);
    }

    static Node merge(Node first, Node second) {

        if (first == null) {
            return second;
        }

        if (second == null) {
            return first;
        }
        Node head;
        if (first.val < second.val) {
            head = first;
            first = first.next;
        } else {
            head = second;
            second = second.next;
        }
        Node temp = head;
        while (first != null && second != null) {
            if (first.val < second.val) {
                temp.next = first;
                first = first.next;

            } else {
                temp.next = second;
                second = second.next;
            }
            if (first != null) {
                temp.next = first;
            } else {
                temp.next = second;
            }

        }
        return head;
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

