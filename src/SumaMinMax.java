import java.util.Arrays;

public class SumaMinMax {
    public static void main(String[] args) {
        int[] array1 = {};
        int[] array2 = {5};
        int[] array3 = {6, 2, 1, 8, 10};
        int[] array4 = {1, 1, 11, 2, 3};
        SumaMinMax sumaMinMax = new SumaMinMax();
        System.out.println(sumaMinMax.sumaArray(array1));
        System.out.println(sumaMinMax.sumaArray(array2));
        System.out.println(sumaMinMax.sumaArray(array3));
        System.out.println(sumaMinMax.sumaArray(array4));
    }

    public int sumaArray(int[] array) {
        if (array == null || array.length < 3) {
            return 0;
        }
        Arrays.sort(array);
        int suma = 0;
        for (int i = 1; i < array.length - 1; i++) {
            suma += array[i];
        }
        return suma;
    }
}

