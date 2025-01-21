public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static class Queue {
        static Node tail = null,head = null;

        // Check if the queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }
        // Add an element to the queue
        public void add(int data) {
          Node newNode = new Node(data);
          if(tail==null){
            head = tail = newNode;
          }
          tail.next = newNode;
          tail = newNode;
        }

        // Remove and return the front element from the queue
        public int dequeue() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1 ;
            }
        if(head==tail){
         tail = null;
        }

         int value = head.data;
         head = head.next;
         return value;

        }

        // Peek the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
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
