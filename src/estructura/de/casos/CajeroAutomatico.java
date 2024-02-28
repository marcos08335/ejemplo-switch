/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.casos;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial del usuario

        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Depositar efectivo");
        System.out.println("4. Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: $" + saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad que desea retirar:");
                double cantidadRetiro = scanner.nextDouble();
                if (cantidadRetiro > saldo) {
                    System.out.println("Fondos insuficientes");
                } else {
                    saldo -= cantidadRetiro;
                    System.out.println("Retiró $" + cantidadRetiro + ". Su saldo actual es: $" + saldo);
                }
                break;
            case 3:
                System.out.println("Ingrese la cantidad que desea depositar:");
                double cantidadDeposito = scanner.nextDouble();
                saldo += cantidadDeposito;
                System.out.println("Depositó $" + cantidadDeposito + ". Su saldo actual es: $" + saldo);
                break;
            case 4:
                System.out.println("Gracias por utilizar el Cajero Automático. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
