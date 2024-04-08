import java.util.Scanner;

public class NumarDinCifrePare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al sirului (1≤n≤9): ");
        int n = scanner.nextInt();
        if (n < 1 || n > 9) {
            System.out.println("Numarul de elemente ale sirului este introdus gresit.");
            return;
        }
        int[] a = new int[n];
        System.out.println("Introduceți cele " + n + " cifre separate prin spațiu: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int k = numerePare(n, a);
        if (k != -1) {
            System.out.println("Numarul format din cifrele pare ale sirului: " + k);
        } else {
            System.out.println("Nu există nicio cifră pară în tablou.");
        }

    }

    public static int numerePare(int n, int[] a) {
        int k = 0;
        boolean numarPar = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                numarPar = true;
                k = k * 10 + a[i];
            }
        }
        if (numarPar) {
            return k;
        } else {
            return -1;
        }
    }
}
