import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("This program asks you for coefficients for a quadratic equation ax^2 + bx + c = 0 and solves for real roots.");
        System.out.print("Give coefficient a:");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("Give coefficient b:");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("Give coefficient c:");
        double c = Double.parseDouble(reader.nextLine());

        if (Math.pow(b, 2) - 4*a*c < 0) {
            System.out.println("No real roots");
        } else if (Math.pow(b, 2) - 4*a*c == 0) {
            System.out.println("One real root");
        } else {
            System.out.println("Two real roots.");
        }
    }
}
