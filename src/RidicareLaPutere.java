public class RidicareLaPutere {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(calculeazaPutere(a, b));
    }
    public static double calculeazaPutere(int a, int b) {
        double rezulat = 1;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                rezulat *= a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                rezulat /= a;
            }
        }
        return rezulat;
    }
}
