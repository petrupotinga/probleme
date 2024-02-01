import java.util.Scanner;

public class SumaNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul n: ");
        int n = scanner.nextInt();
        int suma = n*(n+1)/2;
        System.out.println(suma);
        scanner.close();
    }
}
