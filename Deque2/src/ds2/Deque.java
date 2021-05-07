package ds2;
import ds.Queue;

public class Deque extends Queue {
    public void enqueueRear(int number){
        if (queue == null){
            queue = new int[1];
            queue[0] = number;
        }else{
            int[] temp = new int[queue.length + 1];
            for (int i = 1; i < queue.length; i++) {
                temp[i+1] = queue[i];
            }
            temp[0] = number;
            queue = temp;
        }
    }

    public void deQueueFront(){
        if (queue == null){
            System.err.println("Can't remove from empty deque");
            return;
        }else if (queue.length == 1){
            queue = null;
            return;
        }
        int[] temp = new int[queue.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = queue[i];
        }
        queue = temp;
    }
}
