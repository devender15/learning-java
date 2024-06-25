package recursion;

public class Pattern {
    static void starPattern(int r, int c) {
        if(r==0) {
            return;
        }
        if(c<r) {
            System.out.print("*");
            starPattern(r, c+1);
        } else {
            System.out.println();
            starPattern(r-1, 0);
        }
    }
    public static void main(String[] args) {
        starPattern(10, 0);
    }
}
