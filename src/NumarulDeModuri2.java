import java.util.Scanner;

public class NumarulDeModuri2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de copii: ");
        int numarCopii = scanner.nextInt();
        validareInput(numarCopii);
        System.out.println("Introduceti numarul de jucarii: ");
        int numarJucarii = scanner.nextInt();
        validareInput(numarJucarii);
        int numarulDeModuri = calcululNumaruluiDeModuri(numarCopii, numarJucarii);
        System.out.println("Copiii isi pot alege cite o jucarie in " + numarulDeModuri + " moduri!");
    }

    public static int calcululNumaruluiDeModuri(int numarCopii, int numarJucarii) {
        int numarModuri = 1;
        for (int i = 0; i < numarCopii; i++) {
            int optiuniCopii = numarJucarii - i;
            numarModuri *= optiuniCopii;
        }
        return numarModuri;
    }

    public static void validareInput(int input) {
        if (input < 0) {
            System.out.println("Numarul introdus trebuie sa fie pozitiv si diferit de zero.");
            System.exit(1);
        }
    }
}
