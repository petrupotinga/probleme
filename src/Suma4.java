public class Suma4 {
    public static void main(String[] args) {
        int[] array1 = {};
        int[] array2 = {5};
        int[] array3 = {6, 2, 1, 8, 10};
        int[] array4 = {1, 1, 11, 2, 3};
        System.out.println(sumaArray(array1));
        System.out.println(sumaArray(array2));
        System.out.println(sumaArray(array3));
        System.out.println(sumaArray(array4));
    }

    public static int sumaArray(int[] array) {
        if (array == null || array.length < 3) {
            return 0;
        }
        int min = array[0];
        int max = array[0];
        int suma = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i : array) {
            if (i != min && i != max) {
                suma = suma + i;
            }
        }
        return suma;
    }
}