import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Variables básicas
        String accountNumber = "123456789";
        double balance = 1500.75;
//        String pin;
        Scanner escaner = new Scanner(System.in);
        System.out.print("Ingrese valor de pin: ");

        try {
            int pin = escaner.nextInt();

            // Array de montos de transacciones
            int[] transactionAmount = {200, -100, 50};

            // Operaciones con variables
            balance += transactionAmount[0]; // Depósito
            if (balance > 0 && pin == 1234) {
                System.out.println("Acceso Concedido");
            }

            // Uso de operadores
            balance++; // Incremento
            String status = (balance < 0) ? "Deuda" : "Crédito";
            System.out.println("Estado de cuenta: " + status);
        } catch (InputMismatchException e){
            System.out.println("No introdujo un pin válido. El pin debe ser de 4 dígitos.");
            }
    }
}
