import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    private Stack item;
    ArrayList<Integer> stack = new ArrayList<>();
    private int size;

    public void push(int number){
        stack.add(number);
        size++;
    }

    public void pop(){
        if(size > 0){
            stack.remove(size-1);
            size--;
        }

    }

    public boolean empty(){
        if(size > 0)
            return false;
        else
            return true;
    }

    public int peek(){
        if(size > 0){
            int peek = stack.get(size-1);
            return peek;
        }else{
            return -1;
        }
    }

    public void clear(){
        stack.clear();
    }

    public void print(){
        System.out.println(Arrays.toString(stack.toArray()));
    }





    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print();
        stack.pop();
        stack.print();


    }
}
