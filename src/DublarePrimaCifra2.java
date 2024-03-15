public class DublarePrimaCifra2 {
    public static void main(String[] args) {
        int num = 1645;
        int primaCifra = extragePrimaCifra(num);
        int count = cifre(num);
        int result = (int) Math.pow(10, count) * primaCifra + num;
        System.out.println("Numarul initial este: " + num);
        System.out.println("Rezultatul este: " + result);
    }

    public static int extragePrimaCifra(int numar) {
        while (numar >= 10) {
            numar /= 10;
        }
        return numar;
    }

    public static int cifre(int numar) {
        int numarCifre = 0;
        while (numar >= 10) {
            numar /= 10;
            numarCifre++;
        }
        return numarCifre + 1;
    }
}
