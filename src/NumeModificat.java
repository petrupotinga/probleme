public class NumeModificat {
    public static void main(String[] args) {
        char[] id = new char[50];
        String nume = "David Popovici";
        char[] numeConvertit = nume.toCharArray();
        fNume(numeConvertit, id);
        System.out.println(id);
    }

    static void fNume(char[] s, char[] id) {
        String numeIntreg = new String(s);
        String[] numeDespartit = numeIntreg.split(" ");
        String nume = numeDespartit[1] + 2024;
        char[] numemodificat = nume.toCharArray();
        System.arraycopy(numemodificat, 0, id, 0, numemodificat.length);
    }
}
