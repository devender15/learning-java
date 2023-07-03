import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // removing an element
        list.remove(0);

        // setting an element at a particular index
        list.set(3, 100);


        System.out.println(list);
    }
}
