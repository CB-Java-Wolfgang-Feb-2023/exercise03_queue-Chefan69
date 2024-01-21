public class Main {
    public static void main(String[] args) {
        // Create an object of MyQueue class with a size of 5
        MyQueue queue = new MyQueue(5);

        // Try to delete element from the queue
        System.out.println("Dequeue Operation : " + queue.dequeue());

        // Insert elements to the queue
        for(int i = 1; i <= 5; i++) {
            System.out.println("Enqueue Operation : " + i);
            queue.enqueue(i);
        }

        // Check when queue is full
        System.out.println("Is queue full? : " + queue.isFull());

        // Removes element until it is empty
        while(!queue.isEmpty()) {
            System.out.println("Dequeue Operation : " + queue.dequeue());
        }

        // Check if queue is empty
        System.out.println("Is queue empty? : " + queue.isEmpty());
    }
}
