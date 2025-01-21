public class QueueArray {

    public static class Queue {
        int size;
        int[] arr;
        int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove and return the front element from the queue
        public int dequeue() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            // Shift all elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--; // Decrease the rear pointer
            return front;
        }

        // Peek the front element of the queue
        public int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // Dequeue and display elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
