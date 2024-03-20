public class CaractereComune {
        public static void main(String[] args) {
            String primulSir = "abcdefgh";
            String alDoileaSir = "bcdeghij";
            caractereComune(primulSir, alDoileaSir);
        }
    public static void caractereComune(String s1, String s2) {
        System.out.print("Caracterele comune sunt: ");
        for (int i = 0; i < s1.length(); i++) {
            char caracter = s1.charAt(i);
            if (s2.contains(String.valueOf(caracter))) {
                System.out.print(caracter + " ");
            }
        }
    }
}
