package patterns;

public class First {

    static void patter31(int n) {
        int ogN = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = ogN - Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void patter30(int n) {
        for (int i = 1; i <= n; i++) {
            for(int s = 0; i<n-i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void patter28(int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalColsInRow = i>n ? 2*n-i : i;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalColsInRow = i>n ? 2*n-i : i;
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            // for every row, run the col
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }
    
    static  void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        patter28(5);
//        patter30(5);
        patter31(4);
    }

}
