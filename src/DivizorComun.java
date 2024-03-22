public class DivizorComun {
    public static void main(String[] args) {
        int a = 18;
        int b = 24;
        System.out.println("Cel mai mare divizor comun este: " + divizor(a, b));
    }

    public static int divizor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
