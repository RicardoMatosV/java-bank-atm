import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int attempts = 0;
        boolean flag_1 = false;
        while (attempts < 3) {
            Scanner escaner = new Scanner(System.in);
            System.out.print("Ingrese valor de PIN: ");

            try {
                int PIN_ingresado = escaner.nextInt();
                if (PIN_ingresado > 0 && authenticateUser(PIN_ingresado)) {
                    System.out.println("PIN válido");
                    System.out.println("");
                    flag_1 = true;
                    break;
                } else {
                    attempts++;
                    System.out.println("PIN incorrecto. Intento " + attempts + " de 3.");
                    System.out.println("");
                    flag_1 = false;
                }
            } catch (InputMismatchException e) {
                attempts++;
                System.out.println("PIN incorrecto, el PIN debe ser numérico. Intento " + attempts + " de 3.");
                System.out.println("");
                flag_1 = false;
            }
        }

        if (flag_1){
            System.out.println("Ingreso exitoso!");
        } else {
            System.out.println("Superó la cantidad de intentos. Pruebe más tarde.");
        }
    }
    public static boolean authenticateUser(Integer validar_PIN) {
        int pin = 1234;
        if (validar_PIN == pin){
            return true;
        } else {
            return false;
        }
    }
    }

