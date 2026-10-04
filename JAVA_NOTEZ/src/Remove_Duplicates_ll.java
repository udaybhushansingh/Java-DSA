public class Remove_Duplicates_ll {
        public static void main(String[] args) {

            LinkedList list = new LinkedList();

            // Already existing sorted list
            list.head = new Node(1);
            list.head.next = new Node(1);
            list.head.next.next = new Node(2);
            list.head.next.next.next = new Node(3);
            list.head.next.next.next.next = new Node(3);
            list.head.next.next.next.next.next = new Node(3);
            list.head.next.next.next.next.next.next = new Node(4);

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

            void removeDuplicates() {
                Node temp = head  ;
                while (temp != null && temp.next != null) {

                    if (temp.val == temp.next.val) {
                        temp.next = temp.next.next;
                    } else {
                        temp = temp.next;
                    }
                }
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