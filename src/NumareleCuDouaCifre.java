import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumareleCuDouaCifre {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de numere : ");
        int n = scanner.nextInt();
        System.out.println("Introduceti cele " + n + " numere : ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= 10 && num <= 99) {
                list.add(num);
            }
        }
        System.out.println(list.size() + " numere din cele " + n + " intoduse au doua cifre");
        scanner.close();
    }
}
