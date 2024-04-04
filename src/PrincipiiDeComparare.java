import java.util.*;
public class PrincipiiDeComparare {
    public static void main(String[] args) {
        Integer[] numere = {6, 8, 3, 10, 5};
        Arrays.sort(numere, Comparator.comparingInt(PrincipiiDeComparare::numarulDeDivizori)
                .thenComparingInt(PrincipiiDeComparare::cifraDeControl)
                .thenComparingInt(PrincipiiDeComparare::primaCifra)
                .thenComparingInt(a -> a));
        System.out.println("Numerele sortate: " + Arrays.toString(numere));
    }
    public static int numarulDeDivizori(int numar) {
        int count = 0;
        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static int cifraDeControl(int numar) {
        return numar % 10;
    }
    public static int primaCifra(int numar) {
        while (numar >= 10) {
            numar /= 10;
        }
        return numar;
    }
}

