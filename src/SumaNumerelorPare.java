import java.util.Scanner;

public class SumaNumerelorPare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul n: ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * 2;
        }
        System.out.println("suma 2+4+..+(2n) = " + suma);
        scanner.close();
    }
}
