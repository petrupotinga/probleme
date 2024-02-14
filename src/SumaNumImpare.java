import java.util.Scanner;

public class SumaNumImpare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de numere n: ");
        int n = scanner.nextInt();
        System.out.print("Introduceti valoarea lui k: ");
        int k = scanner.nextInt();
        int sumaImpare = 0;
        int numereDivizibileK = 0;
        System.out.println("Introduceti cele " + n + " numere:");
        for (int i = 0; i < n; i++) {
            int numar = scanner.nextInt();
            if (numar % 2 != 0) {
                sumaImpare += numar;
            }
            if (numar % k == 0) {
                numereDivizibileK++;
            }
        }
        System.out.println("Suma numerelor impare este: " + sumaImpare);
        System.out.println("Numerele divizibile cu " + k + " sunt: " + numereDivizibileK);
        scanner.close();
    }
}

