import java.util.InputMismatchException;
import java.util.Scanner;

public class NumereDivizibile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduceti varianta: ");
            int t = scanner.nextInt();
            if (t == 1) {
                System.out.println("Introduceti numarul n: ");
                int n = scanner.nextInt();
                System.out.println("Introduceti numarul c1: ");
                int c1 = scanner.nextInt();
                System.out.println("Introduceti numarul c2: ");
                int c2 = scanner.nextInt();
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % c1 != 0 && i % c2 != 0) {
                        count++;
                    }
                }
                System.out.println("Numere naturale nenule, mai mici decat n, " +
                        "care nu sunt divizibile nici cu c1, nici cu c2 sunt: " + count);
            }
            if (t == 2) {
                System.out.println("Introduceti numarul n: ");
                int n = scanner.nextInt();
                System.out.println("Introduceti numarul c1: ");
                int c1 = scanner.nextInt();
                System.out.println("Introduceti numarul c2: ");
                int c2 = scanner.nextInt();
                System.out.println("Introduceti numarul c3: ");
                int c3 = scanner.nextInt();
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % c1 != 0 && i % c2 != 0 && i % c3 != 0) {
                        count++;
                    }
                }
                System.out.println("Numere naturale nenule, mai mici decat n, " +
                        "care nu sunt divizibile nici cu c1, nici cu c2 si nici cu c3 sunt: " + count);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input invalid. Va rugam sa introduceti un numar intreg.");
        }
    }
}
