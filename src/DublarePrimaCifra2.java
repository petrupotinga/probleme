public class DublarePrimaCifra2 {
    public static void main(String[] args) {
        int numar = 2548;
        int primaCifra = extragePrimaCifra(numar);
        int count = cifre(numar);
        int result = (int) Math.pow(10, count) * primaCifra + numar;
        System.out.println("Numarul initial este: " + numar);
        System.out.println("Rezultatul este: " + result);
    }

    public static int extragePrimaCifra(int numar) {
        while (numar >= 10 || numar <= -10) {
            numar /= 10;
        }
        return numar;
    }

    public static int cifre(int numar) {
        if (numar == 0) {
            return 1;
        }
        return (int) Math.log10(Math.abs(numar)) + 1;
    }
}
