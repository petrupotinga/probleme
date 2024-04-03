import java.util.Arrays;

public class Acronim {
    public static void main(String[] args) {
        String cuvinte = "Organizatia Natiunilor Unite";
        String[] cuvinteDespartite = cuvinte.split(" ");
        if (cuvinteDespartite.length == 1 || cuvinteDespartite[0].isEmpty()) {
            System.out.println("Sirul de intrare trebuie sa contina cel putin 2 cuvinte.");
            return;
        }
        System.out.println(Arrays.toString(cuvinteDespartite));
        StringBuilder acronim = new StringBuilder();
        for (String cuvint : cuvinteDespartite) {
            if (!cuvint.isEmpty() && Character.isUpperCase(cuvint.charAt(0))) {
                acronim.append(cuvint.charAt(0));
            }
        }
        System.out.println("Acronimul este: " + acronim);
    }
}

