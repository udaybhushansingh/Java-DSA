public class Stack_Implimentation {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }

    static class Stack {

        int[] data;
        int top;

        Stack(int size) {
            data = new int[size];
            top = -1;
        }

        void push(int value) {

            if (top == data.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            top++;
            data[top] = value;
        }

        int pop() {

            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            int value = data[top];
            top--;

            return value;
        }

        int peek() {

            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return data[top];
        }

        boolean isEmpty() {
            return top == -1;
        }

        void display() {

            if (top == -1) {
                System.out.println("Stack is Empty");
                return;
            }

            for (int i = top; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }
    }
}