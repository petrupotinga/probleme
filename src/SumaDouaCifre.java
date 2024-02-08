import java.util.Scanner;

public class SumaDouaCifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de numere: ");
        int n = scanner.nextInt();
        int suma = 0;
        System.out.println("Introduceti cele " + n + " numere:");
        for (int i = 0; i < n; i++) {
            int numar = scanner.nextInt();
            if (numar >= 10 && numar <= 99) {
                suma += numar;
            }
        }
        System.out.println("Suma numerelor cu exact doua cifre este: " + suma);
        scanner.close();
    }
}
