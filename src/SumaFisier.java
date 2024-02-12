import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumaFisier {
    public static void main(String[] args) {
        try {
            File inputFile = new File("suma.in1");
            Scanner scanner = new Scanner(inputFile);
            int n = scanner.nextInt();
            System.out.println("Citim numarul de numere care urmeara sa fie adunate " + n);
            int suma = 0;
            for (int i = 0; i < n; i++) {
                suma += scanner.nextInt();
            }
            System.out.println("Suma este : " + suma);
            scanner.close();

            File outputFile = new File("suma.out");
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println(suma);
            writer.close();
            System.out.println("Suma a fost scrisa in fisierul suma.out");
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit");
            e.printStackTrace();
        }
    }
}
