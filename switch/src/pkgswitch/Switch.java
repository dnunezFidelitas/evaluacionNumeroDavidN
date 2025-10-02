/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author viti
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Utilizar un switch para evaluar las diferentes condiciones
        switch (numero % 2) {
            case 0:
                System.out.println("Soy par");
                break;
            case 1:
            case -1: // Para manejar números negativos
                System.out.println("Soy impar");
                break;
        }

        switch (numero % 5 == 0 ? 1 : 0) {
            case 1:
                System.out.println("Soy divisible entre 5");
                break;
        }

        switch (numero % 7 == 0 ? 1 : 0) {
            case 1:
                System.out.println("Soy divisible entre 7");
                break;
        }

        // Cerrar el scanner
        //scanner.close();
    }
    
}


