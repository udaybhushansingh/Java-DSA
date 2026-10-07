public class CircularQueue {

    public static void main(String[] args) {

        queue q = new queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }

    static class queue {

        int[] data;
        int front;
        int rear;
        int size;

        queue(int capacity) {
            data = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int value) {

            if (size == data.length) {
                System.out.println("Overflow");
                return;
            }

            rear = (rear + 1) % data.length;
            data[rear] = value;
            size++;
        }

        int dequeue() {

            if (size == 0) {
                System.out.println("Underflow");
                return -1;
            }

            int value = data[front];

            front = (front + 1) % data.length;
            size--;

            return value;
        }

        int peek() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return data[front];
        }

        boolean isEmpty() {
            return size == 0;
        }

        void display() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = 0; i < size; i++) {
                int index = (front + i) % data.length;
                System.out.print(data[index] + " ");
            }

            System.out.println();
        }
    }
}