public class DublarePrimaCifra {
    public static void main(String[] args) {
        int numar = 2588742;
        String numarString = String.valueOf(numar);
        char primaCifra = numarString.charAt(0);
//        StringBuilder rezultatStringBuilder = new StringBuilder();
//        rezultatStringBuilder.append(primaCifra).append(primaCifra).append(numarString.substring(1));
//        int rezultat = Integer.parseInt(rezultatStringBuilder.toString());
        int rezultat = Integer.parseInt(String.valueOf(primaCifra) + primaCifra + numarString.substring(1));
        System.out.println("Numarul dat este: " + numar);
        System.out.println("Rezultatul este: " + rezultat);
    }
}