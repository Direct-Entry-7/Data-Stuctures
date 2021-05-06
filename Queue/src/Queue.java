public class Queue {
    private int[] queue;
    public void enqueue(int number){
        if(queue == null){
            queue = new int[1];
            queue[0] = number;
        } else{
            int[] temp = new int[queue.length+1];
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[i];
            }
            temp[queue.length] = number;
            queue = temp;
        }
    }

    public void dequeue(){

    }

    public boolean empty(){
        return queue == null;
    }

    public int peek(){
        return 0;
    }

    public void clear(){

    }

    public int size(){
        return  empty() ? 0: queue.length;
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]+", ");
        }
        System.out.println("\b\b]");
    }

    public boolean contains(int number){
        return false;
    }


}
