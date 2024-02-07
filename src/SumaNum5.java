import java.util.Scanner;

public class SumaNum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduceti numarul natural n: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Introduceti un numar natural pozitiv.");
                return;
            }
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i * i;
            }
            System.out.println("1¹+2²+3³+...n = " + suma);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Introduceti un numar valid.");
        } finally {
            scanner.close();
        }
    }
}
