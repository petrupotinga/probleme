import java.util.Arrays;
import java.util.Scanner;

public class VectorOrdonat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 7;
        int[] vector = new int[n];
        System.out.println("Introdu " + n + " elementele ale sirului:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int k = 3; // Aici poți specifica valoarea lui k sau poți să-l citești și pe el de la consolă
        ordoneazaVector(vector, k);
        System.out.println("Vectorul ordonat: " + Arrays.toString(vector));
    }

    public static void ordoneazaVector(int[] vector, int k) {
        Arrays.sort(vector, 0, k);
        Arrays.sort(vector, k, vector.length);
        for (int i = k, j = vector.length - 1; i < j; i++, j--) {
            int temp = vector[i];
            vector[i] = vector[j];
            vector[j] = temp;
        }
    }
}
