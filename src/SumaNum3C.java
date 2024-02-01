import java.util.Scanner;

public class SumaNum3C {
    public static void main(String[] args) {
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduceti numar (0 pentru a opri): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num >= 100 && num <= 999 && num / 100 == num % 10) {
                suma += num;
            }
        }
        System.out.println("Suma numerelor cu exact trei cifre, cu prima cifră egală cu ultima, este: " + suma);
        scanner.close();
    }
}
