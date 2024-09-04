/**
 *
 * @author Sergio Sanchez 20241222424 Celular 3208689548
 */
package ventallantas; // El nombre del paquete debe ser igual al nombre de la clase pública

import java.util.Scanner;

public class Ventallantas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de llantas a comprar: ");
        int cantidadLlantas = scanner.nextInt();

        double precioUnitario = 0.0;
        double precioTotal = 0.0;

        // Condiciones utilizadas en el programa
        if (cantidadLlantas < 5) {
            precioUnitario = 100.0;
        } else if (cantidadLlantas >= 5 && cantidadLlantas <= 10) {
            precioUnitario = 75.0;
        } else { // Más de 10 llantas
            precioUnitario = 50.0;
        }

        precioTotal = cantidadLlantas * precioUnitario;

        System.out.println("Precio por llanta: COP $" + precioUnitario);
        System.out.println("Precio total de la compra: COP $" + precioTotal);

        scanner.close();
    }
}
