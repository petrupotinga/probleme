import java.util.InputMismatchException;
import java.util.Scanner;

//        Se citesc de la tastatură numerele n k,
//        apoi n numere naturale. Să se determine suma celor care se divid cu k și câte dintre ele sunt pare.
public class SumaNumDivizibileK {
    public static void main(String[] args) {
        int suma = 0;
        int numerePare = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduceti valoarea lui n / numarul de numere naturale: ");
            int n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Numarul n trebuie sa fie natural.");
            }
            System.out.println("Introduceti valoarea lui k: ");
            int k = scanner.nextInt();
            if (k <= 0) {
                throw new IllegalArgumentException("Numaru k trebuie sa fie natural.");
            }
            System.out.println("Introduceti cele " + n + " numere naturale: ");
            for (int i = 0; i < n; i++) {
                int numar = scanner.nextInt();
                if (numar <= 0) {
                    throw new IllegalArgumentException("Numerele introduse trebuie sa fie naturale.");
                }
                if (numar % k == 0) {
                    suma += numar;
                }
                if (numar % 2 == 0) {
                    numerePare++;
                }
            }
            System.out.println("Suma numerelor care se divid cu " + k + " este : " + suma);
            System.out.println("Numere pare sunt : " + numerePare);
        } catch (InputMismatchException e) {
            System.out.println("Input invalid. Va rugam introduceti un numar natural.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
