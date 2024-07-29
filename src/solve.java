import java.util.Scanner;
public class solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Main.ejercicio1();
                    break;
                case 2:
                    Main.ejercicio2();
                    break;
                case 3:
                    Main.ejercicio3();
                    break;
                case 4:
                    Main.ejercicio4();
                    break;
                    case 5:
                    Main.ejercicio5();
                    break;

                case 6:
                    Main.ejercicio6();
                    break;
                case 7:
                    Main.ejercicio7();
                    break;
                case 8:
                    Main.ejercicio8();
                    break;
                case 9:
                    Main.ejercicio9();
                    break;
                    case 10:
                    Main.ejercicio10();
                    break;

                case 11:
                    Main.asignación1();
                    break;
                case 12:
                    Main.asignación2();
                    break;
                case 13:
                    Main.asignación3();
                    break;
                    case 14:
                    Main.asignación4();
                    break;
                case 15:
                    Main.asignación5();
                    break;
                case 16:
                    Main.operadores1();
                    break;
                    case 17:
                    Main.operadores2();
                    break;
                    case 18:
                    Main.operadores3();
                    break;
                case 19:
                    Main.operadores4();
                    break;
                    case 20:
                    Main.operadores5();
                    break;
                case 21:
                    Main.combinados1();
                    break;
                case 22:
                    Main.combinados2();
                    break;
                    case 23:
                    Main.combinados3();
                    break;
                case 24:
                    Main.combinados4();
                    break;
                case 25:
                    Main.combinados5();
                    break;
                case 26:
                    Main.combinados6();
                    break;
                case 27:
                    Main.combinados7();
                    break;
                    case 28:
                    Main.combinados8();
                    break;
                    case 29:
                    Main.combinados9();
                    break;
                    case 30:
                    Main.combinados10();
                    break;
                case 31:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Asignacion 1");
        System.out.println("12. Asignacion 2");
        System.out.println("13. Asignacion 3");
        System.out.println("14. Asignacion 4");
        System.out.println("15. Asignacion 5");
        System.out.println("16. Operadores Incremento y Decremento 1");
        System.out.println("17. Operadores Incremento y Decremento 2");
        System.out.println("18. Operadores Incremento y Decremento 3");
        System.out.println("19. Operadores Incremento y Decremento 4");
        System.out.println("20. Operadores Incremento y Decremento 5");
        System.out.println("21. Combinado 1");
        System.out.println("22. Combinado 2");
        System.out.println("23. Combinado 3");
        System.out.println("24. Combinado 4");
        System.out.println("25. Combinado 5");
        System.out.println("26. Combinado 6");
        System.out.println("27. Combinado 7");
        System.out.println("28. Combinado 8");
        System.out.println("29. Combinado 9");
        System.out.println("30. Combinado 10");

        System.out.println("31. --------------------------");
    }
    }

