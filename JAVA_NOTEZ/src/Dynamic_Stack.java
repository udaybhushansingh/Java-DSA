import java.util.Stack;

public class Dynamic_Stack {

        public static void main(String[] args) {

            stack s = new stack(3);

            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);

            s.display();
        }

        static class stack {

            int[] data;
            int top;

            stack(int size) {
                data = new int[size];
                top = -1;
            }

            void push(int value) {

                if (top == data.length - 1) {
                    resize();
                }

                top++;
                data[top] = value;
            }

            void resize() {

                int[] newArr = new int[data.length * 2];

                for (int i = 0; i <= top; i++) {
                    newArr[i] = data[i];
                }

                data = newArr;
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