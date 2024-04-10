import java.math.BigInteger;

public class UltimeleCifre {
    public static void main(String[] args) {
        long a = 123;
        long n = 4;
        int p = 3;
        String ultimeleCufre = ultimelePCifrePutere(a, n, p);
        System.out.println("Ultimile " + p + " cifre ale lui " + a + "^" + n + " sunt: " + ultimeleCufre);
    }

    public static String ultimelePCifrePutere(long a, long n, int p) {
        BigInteger baza = BigInteger.valueOf(a);
        BigInteger rezultat = baza.modPow(BigInteger.valueOf(n), BigInteger.TEN.pow(p));
        return rezultat.toString();
    }
}
