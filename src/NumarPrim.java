public class NumarPrim {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7};
        prim(a);
    }

    public static void prim(int[] a) {
        for (int num : a) {
            boolean prim = true;
            if (num <= 1) {
                prim = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prim = false;
                        break;
                    }
                }
            }
            if (prim) {
                System.out.println(num + " este număr prim.");
            } else {
                System.out.println(num + " nu este număr prim.");
            }
        }
    }
}
