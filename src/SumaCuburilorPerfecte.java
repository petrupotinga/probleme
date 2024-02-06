import java.util.Scanner;

public class SumaCuburilorPerfecte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul natural n: ");
        int n = scanner.nextInt();
        int suma = 0;
        int numar = 1;
        int contor = 0;
        while (contor < n) {
            int cub = numar * numar * numar;
            if (cub != 0) {
                suma += cub;
                contor++;
            }
            numar++;
        }
        System.out.println("Suma primelor " + n + " cuburi perfecte nenule este: " + suma);
        scanner.close();
    }
}

