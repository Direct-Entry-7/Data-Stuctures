package ds;

public class Queue {
    protected int[] queue;
    public void enqueue(int number){
        if(queue == null){
            queue = new int[1];
            queue[0] = number;
        } else{
            int[] temp = new int[queue.length+1];
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[i];
            }
            temp[temp.length-1] = number;
            queue = temp;
        }
    }

    public void dequeue(){
        if(empty()){
            System.err.println("Cannot remove element from empty Queue");
            return;
        } else if(queue.length ==1){
            queue = null;
            return;
        }
        int[] temp = new int[queue.length-1];
        for (int i = 0; i < queue.length; i++) {
            temp[i] = queue[i+1];
        }
        queue = temp;
    }

    public boolean empty(){
        return queue == null;
    }

    public int peek(){
        if(empty()) {
            throw new RuntimeException("Queue is empty");
        }

        return queue[queue.length-1];
    }

    public void clear(){
        queue =null;
    }

    public int size(){
        return  empty() ? 0: queue.length;
    }

    public void print(){
        if (empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = queue.length - 1; i >=0 ; i--) {
            System.out.print(queue[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public boolean contains(int number){
        if(empty()){
            return false;
        }
        
        for (int i = 0; i < queue.length; i++) {
            if(queue[i] == number)
                return true;
        }
        return false;
    }


}
