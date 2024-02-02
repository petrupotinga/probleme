import java.util.Scanner;

public class CalcululFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un număr natural n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Introdu te rog un număr natural pozitiv.");
        } else {
            long rezultat = calculFactorial(n);
            System.out.println(n + "! = " + rezultat);
        }
    }

    public static long calculFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculFactorial(n - 1);
        }
    }
}
