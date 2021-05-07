public class Deque extends Queue{

    public void enqueueRear(int number){
        if (queue == null){
            queue = new int[1];
            queue[0] = number;
        }else{
            int[] temp = new int[queue.length + 1];
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[i];
            }
            temp[temp.length - 1] = number;
            queue = temp;
        }
    }

    public void deQueueFront(){

    }
}
