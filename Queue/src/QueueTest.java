public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.empty());
        System.out.println(queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.print();
        System.out.println(queue.empty());
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        System.out.println(queue.empty());
        System.out.println(queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println(queue.empty());
        System.out.println(queue.size());
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(303);
        queue.enqueue(400);
        queue.enqueue(500);
        queue.clear();
        queue.peek();
    }
}
