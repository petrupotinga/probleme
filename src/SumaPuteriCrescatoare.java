import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumaPuteriCrescatoare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul n: ");
        int n = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> solutie = gasestePuteri(n);
        Collections.sort(solutie);
        System.out.print("Numerele sunt: ");
        for (int i = 0; i < solutie.size(); i++) {
            System.out.print(solutie.get(i));
            if (i < solutie.size() - 1) {
                System.out.print(" ");
            }
        }
    }
    public static int ceaMaiMarePutere(int n) {
        int putere = 1;
        while (putere <= n) {
            putere *= 2;
        }
        return putere / 2;
    }

    public static ArrayList<Integer> gasestePuteri(int n) {
        ArrayList<Integer> solutie = new ArrayList<>();
        int putere = ceaMaiMarePutere(n);
        if (putere > 0) {
            solutie.add(putere);
            ArrayList<Integer> restul = gasestePuteri(n - putere);
            solutie.addAll(restul);
        }
        return solutie;
    }
}
