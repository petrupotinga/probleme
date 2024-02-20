public class CalculFactorial {
    public static void main(String[] args) {
        int n = 4;
        long factorial = factorial(n);
        System.out.println("Factorialul lui " + n + " este: " + factorial);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorialul nu este definit pentru numere negative.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
