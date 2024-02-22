import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DistantaPuncte {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("distantapuncte.in"));
            PrintWriter writer = new PrintWriter(new File("distantapuncte.out"));
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int distanta = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            writer.println(distanta);
            System.out.println("Done!");
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}