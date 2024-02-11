import java.util.Scanner;

public class PerechiNumerePare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti valoarea pentru r: ");
        int r = scanner.nextInt();
        int numerePare = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    numerePare++;
                }
            }
        }
        System.out.println("Numarul de perechi de numere pare este: " + numerePare);
        scanner.close();
    }
}
