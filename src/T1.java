import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("This program asks you for coefficients for a quadratic equation ax^2 + bx + c = 0 and solves for real roots.");
        System.out.print("Give coefficient a:");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("Give coefficient b:");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("Give coefficient c:");
        double c = Double.parseDouble(reader.nextLine());

        double disc = Math.pow(b, 2) - 4*a*c;

        if (disc < 0) {
            System.out.println("No real roots");
        } else if (disc == 0) {
            double root1 = -b / (2*a);
            System.out.println("One real root: " + root1 );
        } else {
            double root2 = ((-b + Math.sqrt(disc)) / (2*a));
            double root3 = ((-b - Math.sqrt(disc)) / (2*a));
            System.out.println("Two real roots: " + root2 + " and " +root3);
        }
    }
}
