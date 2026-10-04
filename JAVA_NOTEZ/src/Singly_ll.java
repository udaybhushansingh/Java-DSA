public class Singly_ll {

    static void main(String[] args) {

    }

    public static class Node {
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



        int deleteFirst (){
            int value  = head.val ;
            head = head.next;

            if(head == null ){
                tail = null ;
            }
            size --;
            return value;
        }

        int deleteLast (){
            if (size == 0) {
                return -1;
            }

            if (size <= 1) {
                return deleteFirst();
            }
            Node temp = head ;

            while (temp.next != tail){
                temp = temp.next;
            }
            int value = tail.val;

            tail = temp ;

            temp.next = null ;
            size--;

            return value;

        }

        int deleteIndex (int index){

            if(index == 0 ){
                deleteFirst();
            }
            if (index == size -1){
                deleteLast();
            }
            Node temp = head ;

            for (int i = 1; i < index; i++) {
                temp.next = temp ;
            }
             int value = temp.next.val;

            temp.next = temp .next.next ;
            size -- ;

            return value ;
        }

        void insertFirst(int val) {
            Node node = new Node(val);


            if (head == null) {
                head = tail = node;
                return;
            }

            node.next = head;
            head = node;
        }

        void insertLast(int val) {
            Node node = new Node(val);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size ++ ;
        }

        void insert(int val, int index){
            Node node = new Node(val);
             if (index == 0  ){
                 return ;
             }
             if (index == size ){
                 return;
             }

             Node temp = head ;

             for (int i= 1 ; i <index ; i++){
                 temp = temp.next;
             }
             node.next = temp.next ;
             temp.next = node ;
             size++;
        }
        void display(){
            Node temp = head ;
            while (temp != null ){
                System.out.print(temp.val + " -> ");
                temp = temp.next;

            }
            System.out.println("END OF LIST");
        }
    }
}
