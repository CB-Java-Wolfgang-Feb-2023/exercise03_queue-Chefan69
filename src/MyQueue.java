public class MyQueue {
    private final int SIZE;
    private int[] queue;
    private int front, rear;

    public MyQueue(int SIZE) {
        this.SIZE = SIZE;
        queue = new int[SIZE];
        front = -1;
        rear = -1;
    }

    // check if the queue is full
    public boolean isFull() {
        return ((rear + 1) % SIZE == front);
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return (front == -1);
    }

    // insert elements to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % SIZE;
            queue[rear] = element;
        }
    }

    // remove and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % SIZE;
            }
            return element;
        }
    }

    // return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front];
        }
    }
}
