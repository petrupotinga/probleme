import java.util.Scanner;

class SumaProduselor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar natural n: ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * (i + 1);
        }
        System.out.println("Suma S=1*2+2*3+...+n*(n+1) pentru n=" + n + " este: " + suma);
        scanner.close();
    }
}
