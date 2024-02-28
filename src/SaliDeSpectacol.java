import java.util.Scanner;

public class SaliDeSpectacol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaTotala = 0;
        int numDeSali = 15;
        for (int i = 1; i <= numDeSali; i++) {
            System.out.println("Sala numarul " + i);
            int numLocuri = scanner.nextInt();
            if (numLocuri < 0) {
                throw new IllegalArgumentException("Numarul de locuri nu este introdus corect");
            }
            int pretBilet = scanner.nextInt();
            if (pretBilet < 0) {
                throw new IllegalArgumentException("Pretul nu este introdus corect");
            }
            int result = infoSala(numLocuri, pretBilet);
            System.out.println("Prima sala a avut venit de : " + result + " lei!");
            sumaTotala += result;
        }
        System.out.println("Suma toatala cistigata este " + sumaTotala);
    }

    public static int infoSala(int numLocuri, int pretBilet) {
        return numLocuri * pretBilet;
    }
}
