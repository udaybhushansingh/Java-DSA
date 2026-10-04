public class Doubly_LL {
    static void main(String[] args) {

    }

    static class Node {

        int val;
         Node Next;
        Node pre;

        Node(int val) {
            this.val = val;
            this.Next = Next;
            this.pre = pre;
        }


    }

    static class DLinkedList {

        Node head;
        Node tail;
        int size;


        void insertLast(int val) {
            Node node = new Node (val);
            node.Next = null ;

            if (head == null){
                head = tail = node;
                node.pre = null ;
            }else{
                tail.Next = node;
                node.pre = tail;
                tail = node;
            }
        }

        void insertFirsrt(int val) {
            Node node = new Node(val);
            node.pre = null;

            if (head != null) {
                head.pre = node;
            } else {
                tail = node;
            }
            head = node ;
            size++;
        }

        //Q8 — Doubly Linked List: Insert at Last
        void displayForward() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " <-> ");
                temp = temp.Next;
            }

            System.out.println("END");
        }

        void displayBackward() {
            Node temp = tail;

            while (temp != null) {
                System.out.print(temp.val + " <-> ");
                temp = temp.pre;
            }

            System.out.println("START");
        }


        void Reverse(){
            Node temp = head ;
            while (temp != null ){
                Node next = temp.Next;

                temp.Next= temp.pre;
                temp.pre= next;

                temp = next;
            }
            Node swap = head;
            head = tail;
            tail = swap;
        }


        void insertAtIndex(int val){
            int index= 0  ;
            Node temp = head;

            for (int i = 0 ; i< index ; i++){
                temp = temp.Next ;
            }
            Node node = new Node(val);
            node.Next = temp.Next;
            node.pre = temp;

            if (temp.Next != null) {
                temp.Next.pre = node ;
            }
            temp.Next = node;

            size++;

        }





    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.Next;
        }

        System.out.println("END");
    }
}
}
