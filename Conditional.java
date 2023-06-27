import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        /*
            create an if-else condition loop
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary = input.nextInt();
        if(salary > 40_000) {
            salary += 2000;
        } else if(salary < 10_000) {
            salary += 2000;
        } else {
            salary += 500;
        }

        System.out.format("The final salary is %d.", salary);
    }
}
