public class LL_Merge_Two_Sorted {
    static void main(String[] args) {

    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static class LinkedList {

        LL_removeDuplicates.Node head;
        LL_removeDuplicates.Node tail;
        int size;

    }

    Node merge(Node first, Node second) {

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

            temp = temp.next;
        }

        if (first != null) {
            temp.next = first;
        }

        if (second != null) {
            temp.next = second;
        }

        return head;
    }
}