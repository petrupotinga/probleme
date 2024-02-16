import java.util.Scanner;

//        Un număr natural nenul n se numește norocos dacă pătratul lui se poate
//        scrie ca sumă de n numere naturale consecutive.
//        Se dă un număr natural n.Dacă numărul este norocos afișați cele n numere
//        consecutive care adunate dau pătratul acestuia.
public class NumarNorocos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr natural nenul n: ");
        int n = scanner.nextInt();
        int patratulN = n * n;
        int primulNum = (patratulN / n) - (n - 1) / 2;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += primulNum + i;
        }
        if (suma == patratulN) {
            System.out.println("Cele " + n + " numere consecutive sunt:");
            for (int i = 0; i < n; i++) {
                System.out.print((primulNum + i) + " ");
            }
        } else {
            System.out.println("NU ESTE NOROCOS");
        }
    }
}