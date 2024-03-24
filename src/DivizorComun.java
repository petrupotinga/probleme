import java.util.Scanner;

public class DivizorComun {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti primul numar: ");
            int a = scanner.nextInt();
            System.out.print("Introduceti al doilea numar: ");
            int b = scanner.nextInt();
            System.out.println("Cel mai mare divizor comun este: " + divizor(a, b));
        } catch (Exception e) {
            System.out.println("A intervenit o eroare: " + e.getMessage());
        }
    }

    public static int divizor(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Al doilea numar nu poate fi zero.");
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
