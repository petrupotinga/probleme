import java.util.Scanner;

public class NumereleCuDouaCifre2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de numere: ");
        int n = scanner.nextInt();
        int count = 0;
        System.out.println("Introduceti cele " + n + " numere:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= 10 && num <= 99) {
                count++;
            }
        }
        System.out.println("Numerele cu exact doua cifre: " + count);
        scanner.close();
    }
}

