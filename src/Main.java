import java.util.Scanner;

public class Main {

    public static int powerRecursive(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * powerRecursive(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban: ");
        int base = input.nextInt();

        System.out.print("Üs: ");
        int exponent = input.nextInt();

        int result = powerRecursive(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
