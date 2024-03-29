import java.util.Scanner;

public class LungimeaCuvintului {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti texul: ");
        String text = scanner.nextLine();
        System.out.println("Introduceti numarul de litere: ");
        int n = scanner.nextInt();
        lungimea(text, n);
    }

    public static void lungimea(String text, int n) {
        String[] cuvinte = text.split("\\s+");
        boolean cuvintGasit = false;
        for (String cuvint : cuvinte) {
            if (cuvint.length() == n && verificaLitera(cuvint)) {
                cuvintGasit = true;
                System.out.println("Cuvint din " + n + " litere este: " + cuvint);
            }
        }
        if (!cuvintGasit) {
            System.out.println("Cuvint din " + n + " litere nu a fost gasit");
        }
    }

    public static boolean verificaLitera(String cuvint) {
        for (int i = 0; i < cuvint.length(); i++) {
            if (!Character.isLetter(cuvint.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
