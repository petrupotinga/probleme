import java.util.Scanner;

public class SumaProdusConsecutiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar intreg pozitiv: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Numarul introdus trebuie sa fie un numar intreg pozitiv.");
            return;
        }
        long result = SumProdRec(n);
        System.out.println("Suma produselor este: " + result);
        scanner.close();
    }

    public static long SumProdRec(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return (long) (n - 1) * n + SumProdRec(n - 1);
        }
    }
}

