import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>(10);
        // initialization
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
        }

        Scanner in = new Scanner(System.in);

        // adding elements
        for (int i = 0; i < 3; i++) {
            for(int j=0; j<3; j++) {
                multiList.get(i).add(in.nextInt());
            }
        }

        System.out.println(multiList);
    }
}
