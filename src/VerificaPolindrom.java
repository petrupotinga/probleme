import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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
        List<Character> caractere = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            caractere.add(ch);
        }
        ListIterator<Character> iteratorInainte = caractere.listIterator();
        ListIterator<Character> iteratorInapoi = caractere.listIterator(caractere.size());
        while (iteratorInainte.hasNext() && iteratorInapoi.hasPrevious()) {
            if (iteratorInainte.next() != iteratorInapoi.previous()) {
                return false;
            }
        }
        return true;
    }
}

