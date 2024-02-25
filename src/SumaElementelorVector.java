//Scrieți funcția care are antetul:vector<int> CountNum(vector<int> a, int S)
//        Funcția va returna un vector care să memoreze, în ordine crescătoare,
//        un număr cât mai mare de numere din a care au suma mai mică sau egală cu S.

import java.util.Collections;
import java.util.Vector;
public class SumaElementelorVector {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>();
        a.add(3);
        a.add(4);
        a.add(0);
        a.add(7);
        a.add(2);
        int S = 7;
        Vector<Integer> result = CountNum(a, S);
        System.out.println("Vectorul rezultat este: " + result);
    }
    public static Vector<Integer> CountNum(Vector<Integer> a, int S) {
        Collections.sort(a);
        Vector<Integer> rezultat = new Vector<>();
        int suma = 0;
        for (int num : a) {
            if (suma + num <= S) {
                rezultat.add(num);
                suma += num;
            } else {
                break;
            }
        }
        return rezultat;
    }
}
