import java.lang.reflect.Array;
import java.util.Scanner;
import static java.util.Arrays.toString;

public class Arrays {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];

        // checking default values of arrays if we haven't set anything
//        int[] ages = new int[5];
        String[] names = new String[5];
//        boolean[] toggles = new boolean[2];
//        System.out.println(ages[0]);
//        System.out.println(names[0]);
//        System.out.println(toggles[0]);

        // filling the names array
//        for(int i=0; i< names.length; i++) {
//            names[i] = "name " + i;
//        }
//
//        System.out.println(names[3]);

        int[] rollNo = {1, 2, 3, 4};
//        System.out.println(rollNo);

//        for (int j : rollNo) {
//            System.out.println(j);
//        }

        Scanner in = new Scanner(System.in);

        String[] students = new String[5];
        for(int i=0; i< names.length; i++) {
            students[i] = in.next();
        }

    }
}
