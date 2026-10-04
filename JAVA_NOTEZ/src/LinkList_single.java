public class LinkList_single {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Q1
        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);

        // Q2
        list.insert(15, 1);

        list.display();
    }

    // Node
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Linked List
    static class LinkedList {

        Node head;
        Node tail;
        int size;

        // Insert at first
        void insertFirst(int val) {

            Node node = new Node(val);

            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }

            size++;
        }

        // Insert at last
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

        // Insert at given index
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
            temp.next = node;

            size++;
        }

        int deleteFirst (){
            int value  = head.val ;
            head = head.next;

            if(head == null ){
                tail = null ;
            }
            size --;
            return value;
        }

        int deleteLast() {

            if (size == 0) {
                return -1;
            }

            if (size <= 1) {
                return deleteFirst();
            }

            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            int value = tail.val;

            tail = temp;
            tail.next = null;

            size--;

            return value;
        }


        // Q5 — Search / Find a Node

        int search(int value){
            Node temp = head;
            int index = 0 ;
            while (temp != null){
                if (temp.val == value ){
                    return index ;

                }
                temp = temp.next ;
                index ++ ;

            }
            return -1 ;
        }

        // Q6 — Delete a Node at a Given Index

        int delete (int index ){
            if (index == 0 ){
                return deleteFirst() ;
            }
            if (index == size -1){
                return deleteLast() ;
            }
            Node temp = head ;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            int value = temp.next.val;

            temp.next = temp .next.next ;

            size -- ;

            return value ;
        }


        // Display
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