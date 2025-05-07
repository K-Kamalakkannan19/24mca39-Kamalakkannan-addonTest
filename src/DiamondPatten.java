import java.util.Scanner;

public class DiamondPatten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter odd number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0) {
            System.out.println("enter odd number.");
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            printSpaces((n - i) / 2);
            printStars(i);
        }

        for (int i = n - 2; i >= 1; i -= 2) {
            printSpaces((n - i) / 2);
            printStars(i);
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
