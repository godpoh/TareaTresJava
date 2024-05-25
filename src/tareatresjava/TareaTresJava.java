/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareatresjava;

import java.util.Scanner;
import java.util.Random;

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

            if (scanner.hasNextInt()) {
                options = scanner.nextInt();

                switch (options) {
                    case 1:
                        sets();
                        break;
                    case 2:
                        voteSystem();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    default:
                        System.out.println("Ingrese una opcion valida. Intentelo de nuevo!");
                }
            } else {
                scanner.next();
                System.out.println("Ingrese una opcion valida. Intentelo de nuevo!");
            }
        }
    }

    public static void sets() {
        Random random = new Random();

        int pointsPlayerA = 0;
        int pointsPlayerB = 0;

        while (true) {
            int randomNumber = random.nextInt(2);

            if (randomNumber == 0) {
                pointsPlayerA++;
                System.out.println("EL jugador A ha ganado un punto!");
            } else {
                pointsPlayerB++;
                System.out.println("El jugador B ha ganado un punto!");
            }

            if (pointsPlayerA == 6 && pointsPlayerA - pointsPlayerB >= 2) {
                System.out.println("Jugador A gana el Set!");
                break;
            } else if (pointsPlayerB == 6 && pointsPlayerB - pointsPlayerA >= 2) {
                System.out.println("Jugador B gana el Set!");
                break;
            } else if (pointsPlayerA == 5 && pointsPlayerB == 5) {
                System.out.println("Empate de Sets!");

                while (true) {
                    int randomNext = random.nextInt(2);

                    if (randomNext == 0) {
                        pointsPlayerA++;
                        System.out.println("EL jugador A ha ganado un punto!");
                    } else {
                        pointsPlayerB++;
                        System.out.println("El jugador B ha ganado un punto!");
                    }
                    if (pointsPlayerA >= 7 && pointsPlayerA - pointsPlayerB >= 2) {
                        System.out.println("Jugador A gana el Set!");
                        return;
                    } else if (pointsPlayerB >= 7 && pointsPlayerB - pointsPlayerA >= 2) {
                        System.out.println("Jugador B gana el Set!");
                        return;
                    }
                }
            }
        }
    }

    public static void voteSystem() {
        Scanner scanner = new Scanner(System.in);
        int options;
        while (true) {
            System.out.println("Menu Sistema de Votacion: ");
            System.out.println("1. Votar");
            System.out.println("2. Reporte 1");
            System.out.println("3. Reporte 2");
            System.out.println("4. Reporte 3");
            System.out.println("5. Regresar al menu principal");
            System.out.println("Ingrese una de las opciones: ");

            if (scanner.hasNextInt()) {
                options = scanner.nextInt();

                switch (options) {
                    case 1:
                        vote();
                        break;
                    case 2:
                        firstReport();
                        break;
                    case 3:
                        secondReport();
                        break;
                    case 4:
                        thirdReport();
                        break;
                    case 5:
                        System.out.println("Saliendo al menu principal...");
                        return;
                    default:
                        System.out.println("Ingrese una opcion valida. Intentelo de nuevo!");
                }
            } else {
                scanner.next();
                System.out.println("Ingrese una opcion valida. Intentelo de nuevo.");
            }

        }

    }

    public static void vote() {
        Scanner scanner = new Scanner(System.in);

        String candidateA = "Tomas Shelby";
        String candidateB = "Francisco Virgil";
        String candidateC = "Lissia Quiros";

        while (true) {
            System.out.println("Ingrese su edad: ");
            if (scanner.hasNextInt()) {
                
                int edad = scanner.nextInt();
                if (edad < 18) {
                    System.out.println("Usted es menor de edad, no puede votar. Rederigiendo al menu principal...");
                    return;
                }

            } else {
                scanner.next();
                System.out.println("Ingrese un numero valido!");
            }
        }
    }

    public static void firstReport() {

    }

    public static void secondReport() {

    }

    public static void thirdReport() {

    }
}
