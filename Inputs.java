import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking integer input
        System.out.println("What is your roll number?");
        int rollNo = input.nextInt();

        // taking string input ( single word only )
        System.out.println("What is your name?");
        String name = input.next();

        // taking string input ( more than one word )
        System.out.println("Tell me about yourself");
        String about = input.nextLine();

        // taking float input
        System.out.println("How many marks you got in Physics?");
        float physicsMarks = input.nextFloat();

        // printing everything which got from user.
        System.out.format("%d\t%s\t%s\t%f", rollNo, name, about, physicsMarks);
    }
}
