package leetcode;

public class GoodPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};

        int ans = 0;
        int i = 0;
        int j = 1;

        while(i < arr.length - 1) {
            System.out.format("i: %d\tj: %d\n", i, j);
            if(arr[i] == arr[j]) ans += 1;
            j += 1;
            if(j > arr.length - 1) {
                i += 1;
                j = i + 1;
            }
        }
    }
}
