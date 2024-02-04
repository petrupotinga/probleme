import java.util.Scanner;

public class Produsul1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul natural n : ");
            int num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Introduceti un numar natural pozitiv.");
                return;
            }
            long produs = 2;
            for (int i = 2; i <= num; i += 2) {
                produs *= i;
            }
            System.out.println("Produsul este : " + produs);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Introduceti un numar valid.");
        }
    }
}
