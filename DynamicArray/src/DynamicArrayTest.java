public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);
        dynamicArray.print();
        System.out.println(dynamicArray.empty());
        System.out.println(dynamicArray.size());
//        dynamicArray.clear();
//        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.contains(10));
        System.out.println(dynamicArray.get(1));

    }
}
