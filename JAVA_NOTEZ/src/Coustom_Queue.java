public class Coustom_Queue {

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Is Empty: " + q.isEmpty());
    }

    static class Queue {

        int[] data;
        int front;
        int rear;

        Queue(int size) {
            data = new int[size];
            front = 0;
            rear = -1;
        }

        void enqueue(int value) {

            if (rear == data.length - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            rear++;
            data[rear] = value;
        }

        int dequeue() {

            if (front > rear) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int value = data[front];
            front++;

            return value;
        }

        int peek() {

            if (front > rear) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return data[front];
        }

        boolean isEmpty() {
            return front > rear;
        }

        void display() {

            if (front > rear) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }

            System.out.println();
        }
    }
}