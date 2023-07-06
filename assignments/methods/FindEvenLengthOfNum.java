package assignments.methods;

public class FindEvenLengthOfNum {

    static boolean isEvenLength(int num) {
        int length = 0;

        if(num < 0) {
            num *= -1;
        }

        if(num == 0) {
            return false;
        }

        while (num > 0) {
            num /= 10;
            length += 1;
        }
        return length % 2 == 0;
    }
    public static void main(String[] args) {
        int[] arr = {13, 234, 23423, 3455, 123568};
        int count = 0;

        for (int j : arr) {
            if (isEvenLength(j)) count += 1;
        }

        System.out.println(count);
    }
}
