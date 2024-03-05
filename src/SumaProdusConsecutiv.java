public class SumaProdusConsecutiv {
    public static void main(String[] args) {
        int n = 5;
        long result = SumProdRec(n);
        System.out.println("Suma produselor este: " + result);
    }

    public static long SumProdRec(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return (long) (n - 1) * n + SumProdRec(n - 1);
        }
    }
}

