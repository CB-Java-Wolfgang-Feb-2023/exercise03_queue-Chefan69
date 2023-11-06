public class Main {
    public static void main(String[] args) {
        // Create an object of MyQueue class
        MyQueue myQueue = new MyQueue(5);

        // Try to remove an element from the queue => queue is empty.
        // Cannot remove!
        myQueue.remove();

        // Currently, the queue is empty => true
        System.out.println("Is the queue empty? " + myQueue.isEmpty());

        // Add elements to the queue
        myQueue.add(10); // .add() will throw IllegalStateException if no space available
        myQueue.offer(20); // .offer()  will return false if element cannot be inserted due capacity
        myQueue.offer(30);
        myQueue.offer(30);
        myQueue.offer(30);

        myQueue.offer(300);


        // Check when the queue is full => not full yet (3 elements => false)
        System.out.println("Is the queue full? " + (myQueue.size() == myQueue.SIZE));

        // Removes elements until it is empty
        myQueue.remove(); // returns and removes the element in front (head) of queue, it throws an NoSuchElementException  when queue is empty
        myQueue.poll();
        myQueue.poll();

        // Check if the queue is empty => ture, 0 elements in queue
        System.out.println("Is the queue empty? " + myQueue.isEmpty());
    }
}
