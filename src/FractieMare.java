import java.util.Scanner;
public class FractieMare {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            double fractia1 = (double) a / b;
            double fractia2 = (double) c / d;
            if (fractia1 > fractia2) {
                afisareIreductibila(a, b);
            } else {
                afisareIreductibila(c, d);
            }
        }

        // Metodă pentru calculul celui mai mare divizor comun (cmmdc) folosind algoritmul lui Euclid
        public static int cmmdc(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        }
        public static void afisareIreductibila(int numarator, int numitor) {
            int cmmdc1 = cmmdc(numarator, numitor);
            int m = numarator / cmmdc1;
            int n = numitor / cmmdc1;
            System.out.println(m + " " + n);
        }
}

