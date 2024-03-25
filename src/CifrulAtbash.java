public class CifrulAtbash {
    public static void main(String[] args) {
        String input = "ANAAREMERE";
        String criptat = cripteaza(input);
        System.out.println("Textul criptat: " + criptat);
    }

    public static String cripteaza(String s) {
        StringBuilder rezultat = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char caracterCurent = s.charAt(i);
            if (Character.isLetter(caracterCurent)) {
                int distantaDeLaA = caracterCurent - 'A';
                char caracterCriptat = (char) ('Z' - distantaDeLaA);
                rezultat.append(caracterCriptat);
            } else {
                rezultat.append(caracterCurent);
            }
        }
        return rezultat.toString();
    }
}
