public class DynamicArray {
    private int[] numbers;

    public void add(int number) {
        if (numbers == null) {
            numbers = new int[1];
            numbers[0] = number;
        } else {
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1] = number;
            numbers = temp;
        }
    }

    public boolean empty(){
        return numbers == null;
    }

    public int size(){
        return empty() ? 0 :  numbers.length;
    }

    public void print(){
        if (empty()){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void clear(){
        numbers = null;
    }
}
