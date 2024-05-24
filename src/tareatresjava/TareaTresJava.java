/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareatresjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TareaTresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int options;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Sets");
            System.out.println("2. Votaciones");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion: ");
            options = scanner.nextInt();

            switch (options) {
                case 1:
                    sets();
                    break;
                case 2:
                    votes();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Digite un valor que concuerde con las opciones...");
            }
        }
    }

    public static void sets() {

    }

    public static void votes() {

    }
}
