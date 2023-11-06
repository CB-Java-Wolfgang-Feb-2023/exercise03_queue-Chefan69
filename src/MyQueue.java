import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue implements Queue<Integer> {
    protected final int SIZE;
    protected Queue<Integer> queue;

    public MyQueue(int SIZE) {
        this.SIZE = SIZE;
        queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return queue.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        if (size() == SIZE) {
            System.out.println("Queue is full. Cannot add element: " + integer);
            return false;
        } else {
            return queue.add(integer);
        }
    }

    @Override
    public boolean offer(Integer integer) {
        if (size() == SIZE) {
            System.out.println("Queue is full. Cannot offer element: " + integer);
            return false;
        } else {
            return queue.offer(integer);
        }
    }

    @Override
    public Integer remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return null;
        } else {
            return queue.remove();
        }
    }

    @Override
    public Integer poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot poll.");
            return null;
        } else {
            return queue.poll();
        }
    }

    @Override
    public Integer element() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to retrieve.");
            return null;
        } else {
            return queue.element();
        }
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return null;
        } else {
            return queue.peek();
        }
    }

    @Override
    public boolean remove(Object o) {
        return queue.remove(o);
    }

    @Override
    public boolean containsAll(java.util.Collection<?> collection) {
        return queue.containsAll(collection);
    }

    @Override
    public boolean addAll(java.util.Collection<? extends Integer> collection) {
        if (size() + collection.size() > SIZE) {
            System.out.println("Adding all elements will exceed the queue size.");
            return false;
        } else {
            return queue.addAll(collection);
        }
    }

    @Override
    public boolean removeAll(java.util.Collection<?> collection) {
        return queue.removeAll(collection);
    }

    @Override
    public boolean retainAll(java.util.Collection<?> collection) {
        return queue.retainAll(collection);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public String toString() {
        return "MyQueue: " + queue.toString();
    }
}
