import java.util.Scanner;

public class NumarulDeModuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de copii (n): ");
        int n = scanner.nextInt();
        System.out.println("Introduceti numarul de jucarii (m): ");
        int m = scanner.nextInt();
        int numarulModuri = 1;
        for (int i = 0; i < n; i++) {
            int optiunCopil = m - i;
            numarulModuri *= optiunCopil;
        }
        System.out.println("Copiii isi pot alege cite o jucarie in " + numarulModuri + " moduri!");
    }
}
