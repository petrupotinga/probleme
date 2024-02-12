import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul n: ");
        int n = scanner.nextInt();
        int e = 0;
        while (Math.pow(2, e) <= n) {
            e++;
        }
        System.out.println("Exponentul maxim e este: " + (e - 1));
    }
}

