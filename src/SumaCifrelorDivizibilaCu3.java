public class SumaCifrelorDivizibilaCu3 {
    public static void main(String[] args) {
        int[] sir = {123, 124, 242, 351};
        System.out.println("Elementele sirului pentru care suma cifrelor este divizibila cu 3:");
        for (int numar : sir) {
            if (sumaDivizibilaCu3(numar)) {
                System.out.println(numar);
            }
        }
    }

    public static int sumaCifrelor(int numar) {
        int suma = 0;
        while (numar != 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }

    public static boolean sumaDivizibilaCu3(int numar) {
        return sumaCifrelor(numar) % 3 == 0;
    }
}

