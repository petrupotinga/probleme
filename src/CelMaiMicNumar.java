import java.util.Arrays;

public class CelMaiMicNumar {
    public static void main(String[] args) {
        int numar = 982734;
        int rezultat = celMaiMicNumar(numar);
        System.out.println("Cel mai mic număr format cu cifrele lui " + numar + " este: " + rezultat);
    }

    public static int celMaiMicNumar(int numar) {
        String numarString = String.valueOf(numar);
        char[] cifre = numarString.toCharArray();
        Arrays.sort(cifre);
        int index = 0;
        while (cifre[index] == '0') {
            index++;
        }
        String rezultatString = new String(cifre, index, cifre.length - index);
        return Integer.parseInt(rezultatString);
    }
}

