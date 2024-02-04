import java.util.Scanner;

public class Produsul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul natural n mai mare ca 0: ");
        int num = scanner.nextInt();
        int produs = 2;
        for (int i = 2; i <= num; i += 2) {
            produs = produs * i;
        }
        System.out.println("Produsul este : " + produs);
    }
}
