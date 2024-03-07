public class PrimaUltimaCiflra {
    public static void main(String[] args) {
        int numar = 170;
        int p = primaCifra(numar);
        int u = ultimaCifra(numar);
        int suma = p + u;

        System.out.println("Prima cifra: " + p);
        System.out.println("Ultima cifra: " + u);
        System.out.println("Suma: " + suma);
    }

    public static int primaCifra(int numar) {
        while (numar >= 10) {
            numar /= 10;
        }
        return numar;
    }

    public static int ultimaCifra(int numar) {
        return numar % 10;
    }
}