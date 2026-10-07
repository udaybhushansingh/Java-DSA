import java.util.Stack;
public class Queue_USING_stack {
    static void main(String[] args) {
        queue q = new queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Front: " + q.peek());

        System.out.println("Empty: " + q.empty());
    }

    static class queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        void enqueue(int value) {
            stack1.push(value);
        }

        int dequeue (){
            if (stack1.isEmpty() && stack2.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!stack1.isEmpty()){

                stack2.push(stack1.pop());

            }
            return stack2.pop();
        }

        int peek() {

            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            return stack2.peek();
        }


        boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}