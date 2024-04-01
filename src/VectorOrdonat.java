import java.util.Arrays;

public class VectorOrdonat {
    public static void main(String[] args) {
        int[] vector = {13, 1, 10, 15, 3, 7, 11, 17, 19};
        int k = 3;
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
