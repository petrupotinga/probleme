public class NumarulDeSubmultimi {
    public static void main(String[] args) {
        int m = 4;
        int s = 2;
        int numarSubmultimi = calculeazaNumarSubmultimi(m, s);
        System.out.println("Numărul de submulțimi: " + numarSubmultimi);
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculeazaNumarSubmultimi(int m, int s) {
        return factorial(m) / (factorial(s) * factorial(m - s));
    }
}