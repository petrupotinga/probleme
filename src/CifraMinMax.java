public class CifraMinMax {
    public static void main(String[] args) {
        int numar = 248;
        int[] rezultat = new int[2];
        gasesteCifreMinMax(numar, rezultat);
        System.out.println("Cea mai mare cifră: " + rezultat[0]);
        System.out.println("Cea mai mică cifră: " + rezultat[1]);
    }

    public static void gasesteCifreMinMax(int numar, int[] rezultat) {
        int cifraMinima = 9;
        int cifraMaxima = 0;
        while (numar > 0) {
            int cifra = numar % 10;
            cifraMinima = Math.min(cifraMinima, cifra);
            cifraMaxima = Math.max(cifraMaxima, cifra);
            numar /= 10;
        }
        rezultat[0] = cifraMaxima;
        rezultat[1] = cifraMinima;
    }
}
