import java.util.Scanner;

public class SelectareVocale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = calculNumarulDeVocale(input);
        System.out.println("Numărul de vocale între două consoane este: " + count);
    }

    public static int calculNumarulDeVocale(String input) {
        int count = 0;
        input = input.toLowerCase(); // toLowerCase() converteste șirul la litere mici
        for (int i = 1; i < input.length() - 1; i++) {
            char actualChar = input.charAt(i);
            char precedentChar = input.charAt(i - 1);
            char urmatorChar = input.charAt(i + 1);

            if (vocala(actualChar) && consoana(precedentChar) && consoana(urmatorChar)) {
                count++;
            }
        }

        return count;
    }

    public static boolean vocala(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean consoana(char c) {
        return Character.isLetter(c) && !vocala(c);
    }
}