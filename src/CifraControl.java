import java.util.Scanner;

public class CifraControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Numărul introdus trebuie să fie un număr pozitiv.");
        } else {
            int cifraDeControl = calculCifraDeControl(n);
            System.out.println("Cifra de control a numărului " + n + " este: " + cifraDeControl);
        }

        scanner.close();
    }


    public static int calculCifraDeControl(int n) {
        while (n >= 10) {
            int sumaCifrelor = 0;
            while (n != 0) {
                sumaCifrelor += n % 10;
                n /= 10;
            }
            n = sumaCifrelor;
        }
        return n;
    }
}
