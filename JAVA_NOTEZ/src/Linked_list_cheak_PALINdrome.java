public class Linked_list_cheak_PALINdrome {
    static void main() {

    }
    static class Node {
        int val;
        Reverse_LL_Recursive.Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static boolean isPalindrome(Node head){

        return true ;
    }

    static void display(Reverse_LL_Recursive.Node head) {

        Reverse_LL_Recursive.Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

}

