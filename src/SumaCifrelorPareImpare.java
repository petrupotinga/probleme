public class SumaCifrelorPareImpare {
    public static void main(String[] args) {
        int num = 12345;
        int sumPare = 0, sumImpare = 0;
        calculateSum(num, sumPare, sumImpare);
    }

    public static void calculateSum(int numar, int sumPare, int sumImpare) {
        while (numar > 0) {
            int n = numar % 10;
            if (n % 2 == 0) {
                sumPare += n;
            } else {
                sumImpare += n;
            }
            numar /= 10;
        }
        System.out.println("Suma cifrelor pare: " + sumPare);
        System.out.println("Suma cifrelor impare: " + sumImpare);
    }
}
