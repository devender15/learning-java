public class Counter {
    public static void main(String[] args) {
        int n = 45536;
        int counter = 0;

        while(n > 0) {
            int rem = n%10;
            if(rem == 5) counter += 1;
            n = n/10;
        }

        System.out.println(counter);
    }
}
