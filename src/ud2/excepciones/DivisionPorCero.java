package ud2.excepciones;

public class DivisionPorCero {
    public static void main(String[] args) {
        int a = 4, b = 0;
        try {
            System.out.println(a/b);
            System.out.println("División existosa");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: División por cero?");
            System.out.println(e.toString());
        }
    }
}
