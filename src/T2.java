import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Anna positiivinen binääriluku: ");
        String bin = reader.nextLine();
        int pit = bin.length();
        int value = 0;
        int iter = 1;

        for (int i = pit - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                value += iter;

            }
            iter = iter * 2;


        }
        System.out.printf("Binääriluku %s on kymmenjärjestelmässä %d", bin, value);
    }
}
