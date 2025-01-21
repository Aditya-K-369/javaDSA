public class CircularQueue{

    public static class Queue {
        int size;
        int[] arr;
        int rear = -1,front=-1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1 &&front ==-1;
        }
        public boolean full(){
            return (rear+1 )%size==front;
        }

        // Add an element to the queue
        public void add(int data) {
            if (full()) {
                System.out.println("Queue is full");
                return;
            }
            if(front==-1)front =0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // Remove and return the front element from the queue
        public int dequeue() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear=front=-1;

            }else{
                front = (front+1)%size;
            }
            return result;
        }

        // Peek the front element of the queue
        public int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.dequeue());
        q.add(5);

        // Dequeue and display elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
