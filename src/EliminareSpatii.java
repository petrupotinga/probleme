public class EliminareSpatii {
    public static void main(String[] args) {
        String s = "   Hello, world!   ";
        System.out.println("Șirul original: \"" + s + "\"");
        System.out.println("Șirul trim: \"" + trim(s) + "\"");
    }

    public static String trim(String s) {
        return s.trim();
    }
}


