public class LL_removeDuplicates {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);

        System.out.println("Before:");
        list.display();

        list.removeDuplicates();

        System.out.println("After:");
        list.display();
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static class LinkedList {

        Node head;
        Node tail;
        int size;

        void insertLast(int val) {

            Node node = new Node(val);

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }

        void removeDuplicates() {

            Node temp = head;

            while (temp != null && temp.next != null) {

                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                    size--;
                } else {
                    temp = temp.next;
                }
            }

            tail = temp;
        }

        void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("END");
        }
    }
}