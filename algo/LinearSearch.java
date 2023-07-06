package algo;
import java.util.Arrays;

public class LinearSearch {

    static int findTarget(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        // run for a loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int target = 50;
        String str = "hello";
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

//        System.out.println(findTarget(arr, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
