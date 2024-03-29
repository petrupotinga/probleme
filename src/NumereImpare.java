public class NumereImpare {
    public static void main(String[] args) {
        int[] sir = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numarImpare = numaraImpare(sir);
        System.out.println("Numărul de elemente impare din șir este: " + numarImpare);
    }
    public static int numaraImpare(int[] sir) {
        int numarImpare = 0;
        for (int numar : sir) {
            if (numar % 2 != 0) {
                numarImpare++;
            }
        }
        return numarImpare;
    }
}

