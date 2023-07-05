package leetcode;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayWithSomeRules {

    static int[] insert(int n, int[] arr, int x, int pos) {
        // new arr
        int[] newArr = new int[n+1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (int i = 0; i < n + 1; i++) {
            if(i < pos) {
                newArr[i] = arr[i];
            }
            else if(i == pos) {
//                System.out.println(i);
                newArr[i] = x;
            }
            else {
//                System.out.println(i);
                newArr[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        Object[] ans = new ArrayList<>(arr.length);

//        int[] ans = new int[arr.length];

//        for (int i = 0; i < arr.length; i++) {
////            ans[index[i]] = arr[i];
//            int currentNum = arr[i];
//            int currentIndex = index[i];
////            System.out.format("num: %d\t index: %d\n", currentNum, currentIndex);
////            System.out.println(Arrays.toString(ans));
//            arr = insert(arr.length, arr, currentNum, currentIndex);
//        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            ans.add(index[i], arr[i]);
        }

        ans = ans.toArray();
        System.out.println(ans);

    }
}
