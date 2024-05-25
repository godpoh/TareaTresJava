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

    private static int candidateTomas = 0;
    private static int candidateFrancisco = 0;
    private static int candidateLissia = 0;

    private static int provinceAlajuela = 0;
    private static int provinceGuanacaste = 0;
    private static int provinceSanJose = 0;

    private static int ageRange1829 = 0;
    private static int ageRange3059 = 0;
    private static int ageRange60Plus = 0;

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
            System.out.println("2. Reporte votos por candidato");
            System.out.println("3. Reporte votos por provincia");
            System.out.println("4. Reporte votos por edad");
            System.out.println("5. Regresar al menu principal");
            System.out.println("Ingrese una de las opciones: ");

            if (scanner.hasNextInt()) {
                options = scanner.nextInt();

                switch (options) {
                    case 1:
                        vote();
                        break;
                    case 2:
                        firstReport(candidateTomas, candidateLissia, candidateFrancisco);
                        break;
                    case 3:
                        secondReport(provinceAlajuela, provinceGuanacaste, provinceSanJose);
                        break;
                    case 4:
                        thirdReport(ageRange1829, ageRange3059, ageRange60Plus);
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

        while (true) {
            System.out.println("Ingrese su edad: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();

                if (age < 18) {
                    System.out.println("Usted es menor de edad, no puede votar. Rederigiendo al menu principal...");
                    return;
                } else if (age >= 18 && age <= 29) {
                    ageRange1829++;
                } else if (age >= 30 && age <= 59) {
                    ageRange3059++;
                } else if (age >= 60 && age <= 120) {
                    ageRange60Plus++;
                } else {
                    System.out.println("No puede ingresar mas de 120 anos, intentelo de nuevo.");
                    continue;
                }
                while (true) {
                    System.out.println("Seleccion de provincia.");
                    System.out.println("1. Alajuela");
                    System.out.println("2. Guanacaste");
                    System.out.println("3. San Jose");
                    System.out.println("Seleccione que provincia pertenece");

                    if (scanner.hasNextInt()) {
                        int province = scanner.nextInt();

                        if (province == 1) {
                            provinceAlajuela++;
                        } else if (province == 2) {
                            provinceGuanacaste++;
                        } else if (province == 3) {
                            provinceSanJose++;
                        } else {
                            System.out.println("Ingrese una opcion valida!");
                            continue;
                        }

                    } else {
                        scanner.next();
                        System.out.println("Ingrese una opcion valida!");
                        continue;
                    }
                    while (true) {
                        System.out.println("Seleccione el candidato de su preferencia:");
                        System.out.println("1. Tomas Shelby");
                        System.out.println("2. Francisco Virgil");
                        System.out.println("3. Lissia Quiros");
                        System.out.println("Ingrese el numero correspondiente al candidato:");
                        if (scanner.hasNextInt()) {
                            int voteCandidate = scanner.nextInt();
                            if (voteCandidate == 1) {
                                candidateTomas++;
                                break;
                            } else if (voteCandidate == 2) {
                                candidateFrancisco++;
                                break;
                            } else if (voteCandidate == 3) {
                                candidateLissia++;
                                break;
                            } else {
                                System.out.println("Opcion invalida. Ingrese una opcion que concuerde");
                                continue;
                            }
                        } else {
                            scanner.next();
                            System.out.println("Opcion invalida. Ingrese una opcion que concuerde");
                            continue;
                        }
                    }
                    System.out.println("Muchas gracias por su voto!");
                    voteSystem();
                }
            } else {
                scanner.next();
                System.out.println("Ingrese una opcion valida!");
                continue;
            }
        }
    }

    public static void firstReport(int candidateTomas, int candidateFrancisco, int candidateLissia) {
        System.out.println("Cantidad de votos por candidato: ");
        System.out.println("Votos de Tomas Shelby: " + candidateTomas);
        System.out.println("Votos de Francisco Virgil: " + candidateFrancisco);
        System.out.println("Votos de Lissia Quiros: " + candidateLissia);
    }

    public static void secondReport(int provinceAlajuela, int provinceGuanacaste, int provinceSanJose) {
        System.out.println("Cantidad de votos por provincia: ");
        System.out.println("Alajuela: " + provinceAlajuela);
        System.out.println("Guanacaste: " + provinceGuanacaste);
        System.out.println("San Jose: " + provinceSanJose);
    }

    public static void thirdReport(int ageRange1829, int ageRange3059, int ageRange60Plus) {
        System.out.println("Cantidad de votos por edad: ");
        System.out.println("Cantidad de votos de 18-29 anos: " + ageRange1829);
        System.out.println("Cantidad de votos de 30-59 anos: " + ageRange3059);
        System.out.println("Cantidad de votos de 60+ anos: " + ageRange60Plus);
    }
}
