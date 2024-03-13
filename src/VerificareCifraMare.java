import java.util.Scanner;

public class VerificareCifraMare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți textul:");
        String text = scanner.nextLine();
        String[] cuvinte = text.split(" ");
        int maxNumar = 0;
        for (String cuvant : cuvinte) {
            if (cuvant.matches("\\d+")) {  // Verificăm dacă cuvântul este un număr
                int numar = Integer.parseInt(cuvant);
                if (numar > maxNumar) {
                    maxNumar = numar;
                }
            }
        }
        if (maxNumar != 0) {
            System.out.println("Numărul cu cea mai mare cifră este: " + maxNumar);
        } else {
            System.out.println("Nu există niciun număr în text.");
        }
        scanner.close();
    }
}

