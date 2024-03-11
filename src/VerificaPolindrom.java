import java.util.Scanner;

public class VerificaPolindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți șirul: ");
        String input = scanner.nextLine();
        if (estePalindrom(input)) {
            System.out.println("Șirul este un palindrom.");
        } else {
            System.out.println("Șirul NU este un palindrom.");
        }
    }

    public static boolean estePalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

