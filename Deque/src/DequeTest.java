public class DequeTest{
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.enqueue(10);
        deque.enqueue(20);
        deque.enqueue(30);
        deque.enqueue(40);
        deque.enqueue(50);
        deque.print();
        deque.enqueueRear(60);
        deque.print();
        deque.deQueueFront();
        deque.deQueueFront();
        deque.deQueueFront();
        deque.deQueueFront();
        deque.deQueueFront();
        deque.print();
        deque.deQueueFront();
        deque.print();
        deque.deQueueFront();
        deque.print();
    }
}
