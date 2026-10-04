public class Circular_ll {

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

        static class CircularLinkedList {


            Node head;
            Node tail;
            int size;

            void insert(int val) {
                Node node = new Node(val);
                if (head == null) {
                    head = tail = node;
                    node.next = head;
                }else {
                    tail.next = node;
                    node.next = head ;
                    tail = node ;
                }
                size++;
            }
            int delete(){
                if (head == null) {
                    return -1;
                }
                int val = head.val;
                if (head == tail) {
                    head = tail = null;
                    size--;
                    return val;
                }
                head= head.next ;
                tail.next = head ;

                size--;

                return val;


            }

            void display(){
            Node temp = head;
                do {
                    System.out.print(temp.val + " -> ");
                    temp = temp.next;
                }
                while (temp != head);
                System.out.println("HEAD");

            }
        }

    }
}