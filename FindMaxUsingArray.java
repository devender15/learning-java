public class FindMaxUsingArray {
    static int getMax(int[] arr) {
        int max = 0;
        for(int elem: arr) {
            if(elem > max) max = elem;
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {23, 32, 69, 29, 50};
        System.out.println("The maximum number in arr is " + getMax(arr));
    }
}
