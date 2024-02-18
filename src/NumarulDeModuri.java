import java.util.Scanner;

public class NumarulDeModuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de copii n: ");
        int n = scanner.nextInt();
        System.out.println("Introduceti numarul de jucarii m: ");
        int m = scanner.nextInt();
        int numarulModuri = 1;
        for (int i = 0; i < m; i++) {
            numarulModuri *= n;
        }
        System.out.println("Numarul de moduri este : " + numarulModuri);
    }
}
