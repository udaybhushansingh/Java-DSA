public class Doubly_LLll {
    static void main(String[] args) {

    }

    public class Linked {
        static class Node {
            int val;
            Node next;
            Node prev;

            Node(int val) {
                this.val = val;

            }
        }


        static class DDLinked {

            Node head;
            Node tail;
            int size;

            void insertFirst(int val) {

                Node node = new Node(val);

                if (head == null) {
                    head = tail = node;
                } else {
                    node.next = head;
                    head.prev = node;
                    head = node;
                }

                size++;
            }

            void insertLast(int val) {

                Node node = new Node(val);

                if (head == null) {
                    head = tail = node;
                } else {
                    tail.next = node;
                    node.prev = tail;
                    tail = node;
                }

                size++;
            }

            void insert(int val, int index) {

                if (index == 0) {
                    insertFirst(val);
                    return;
                }

                if (index == size) {
                    insertLast(val);
                    return;
                }

                Node temp = head;

                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }

                Node node = new Node(val);

                node.next = temp.next;
                node.prev = temp;

                temp.next.prev = node;
                temp.next = node;

                size++;
            }

            void displayForward() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.val + " <-> ");
                    temp = temp.next;
                }

                System.out.println("END");
            }

            void displayBackward() {
                Node temp = tail;
                while (temp != null) {
                    System.out.print(temp.val + " <-> ");
                    temp = temp.prev;
                }

                System.out.println("END");
            }

            void Reverse() {
                Node temp = head;
                while (temp != null) {
                    Node next = temp.next;
                    temp.next = temp.prev;
                    temp = next;
                }
                Node swap = head;
                head = tail;
                tail = swap;
            }

            int deleteFirst() {
                if (head == null) {
                    return -1;
                }
                int value = head.val;
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                    head.prev = null;
                }

                size--;
                return value;
            }


            int deleteLast() {

                if (tail == null) {
                    return -1;
                }
                int value = tail.val;
                if (head == tail) {
                    head = tail = null;
                } else {
                    tail = tail.prev;
                    tail.next = null;
                }
                size--;
                return value;
            }


            int delete(int index) {
                if (index == 0) {
                    return deleteFirst();
                }

                if (index == size - 1) {
                    return deleteLast();
                }
                Node temp = head;

                for (int i = 1; i < index; i++) {
                    temp = temp.next;
                }
                int val = temp.next.val ;
                temp.next = temp.next.next;
                temp.prev = temp;

                size--;

                return val;

            }



        void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " <-> ");
                temp = temp.next;
            }

            System.out.println("END");
        }
    }

}
}