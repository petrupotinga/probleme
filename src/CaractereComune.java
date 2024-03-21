import java.util.Scanner;

public class CaractereComune {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceți primul șir de caractere: ");
            String primulSir = scanner.nextLine();

            System.out.print("Introduceți al doilea șir de caractere: ");
            String alDoileaSir = scanner.nextLine();

            caractereComune(primulSir, alDoileaSir);

            scanner.close();
        } catch (Exception e) {
            System.out.println("A intervenit o excepție: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void caractereComune(String s1, String s2) {
        try {
            if (s1 == null || s2 == null) {
                throw new NullPointerException("Unul dintre șiruri este null.");
            }

            System.out.print("Caracterele comune sunt: ");
            for (int i = 0; i < s1.length(); i++) {
                char caracter = s1.charAt(i);
                if (s2.contains(String.valueOf(caracter))) {
                    System.out.print(caracter + " ");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index în afara limitelor. Verificați lungimea șirurilor introduse.");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A intervenit o excepție: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
