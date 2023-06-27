import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type any character");
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') System.out.println("This character is a lowercase character");
        else System.out.println("This character is an uppercase character");
    }
}
