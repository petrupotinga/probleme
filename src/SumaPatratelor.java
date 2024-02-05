import java.util.Scanner;

public class SumaPatratelor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul natural n: ");
        long n = scanner.nextLong();
        long rezultat = produsPatratePerfecte(n);
        System.out.println("Produsul primelor " + n + " pătrate perfecte este: " + rezultat);
    }

    public static long produsPatratePerfecte(long n) {
        long produs = 1;
        for (int i = 1; i <= n; i++) {
            long patratPerfect = i * i;
            produs *= patratPerfect;
        }
        return produs;
    }
}

