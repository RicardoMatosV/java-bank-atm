
/*public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello, JavaBank ATM!");
    }
}*/

public class Main1 {
    public static void main(String[] args) {
        int result;
        try {
            result = 10 / 2; // Genera una excepción
            System.out.println("El resultado es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}
