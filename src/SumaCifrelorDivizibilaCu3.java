public class SumaCifrelorDivizibilaCu3 {

    public static void main(String[] args) {
        int[] sir = {123, 124, 242, 351};
        int divizor = 2;
        System.out.println("Elementele sirului pentru care suma cifrelor este divizibila cu " + divizor + ":");
        for (int numar : sir) {
            if (sumaDivizibilaCu(numar, divizor)) {
                System.out.println(numar);
            }
        }
    }

    public static int sumaCifrelor(int numar) {
        numar = Math.abs(numar); // Asigurăm că lucrăm cu valoarea absolută a numărului
        int suma = 0;
        while (numar != 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }

    public static boolean sumaDivizibilaCu(int numar, int divizor) {
        return sumaCifrelor(numar) % divizor == 0;
    }
}


