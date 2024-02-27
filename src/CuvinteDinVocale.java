//Se dă o propoziție care conține numai litere mici ale alfabetului englez și spații.
//        Să se afișeze cuvintele din propoziție care conțin numai vocale.

import java.util.Scanner;

public class CuvinteDinVocale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți propoziția:");
        String propozitie = scanner.nextLine();
        String[] cuvinte = propozitie.split(" ");
        System.out.println("Cuvintele care conțin doar vocale sunt:");
        for (String cuvant : cuvinte) {
            if (contineDoarVocale(cuvant)) {
                System.out.println(cuvant);
            }
        }
        scanner.close();
    }

    public static boolean contineDoarVocale(String cuvant) {
        cuvant = cuvant.toLowerCase();
        for (int i = 0; i < cuvant.length(); i++) {
            char litera = cuvant.charAt(i);
            if (litera != 'a' && litera != 'e' && litera != 'i' && litera != 'o' && litera != 'u') {
                return false;
            }
        }
        return true;
    }
}

