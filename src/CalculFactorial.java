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
        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }
}
