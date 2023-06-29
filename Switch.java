import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch (fruit.toLowerCase()) {
            case "mango" -> {
                System.out.println("You are of my type!");
                System.out.println("Mango lover 💗");
            }
            case "apple" -> System.out.println("Red flag!!");
            case "grapes" -> System.out.println("Hey fox!");
            default -> System.out.println("You don't belong to my category!");
        }
    }
}
