package Recursividad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n TALLER RECURSIVIDAD ");
            System.out.println("1. Factorial");
            System.out.println("2. Sumatoria hasta n");
            System.out.println("3. Sumatoria 1 + 1/2 + ... + 1/n");
            System.out.println("4. Invertir número");
            System.out.println("5. Suma de dígitos");
            System.out.println("6. Potencia");
            System.out.println("7. MCD (Euclides)");
            System.out.println("8. Cociente por restas sucesivas");
            System.out.println("9. Multiplicación por sumas sucesivas");
            System.out.println("10. Suma de arreglo");
            System.out.println("11. Suma de matriz");
            System.out.println("12. Fibonacci");
            System.out.println("13. Ackerman");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese n: ");
                    int n1 = sc.nextInt();
                    System.out.println("Factorial: " + Recursividad.factorial(n1));
                    break;
                case 2:
                    System.out.print("Ingrese n: ");
                    int n2 = sc.nextInt();
                    System.out.println("Sumatoria: " + Recursividad.sumatoriaHasta(n2));
                    break;
                case 3:
                    System.out.print("Ingrese n: ");
                    int n3 = sc.nextInt();
                    System.out.println("Sumatoria fracciones: " + Recursividad.sumatoriaFracciones(n3));
                    break;
                case 4:
                    System.out.print("Ingrese número: ");
                    int n4 = sc.nextInt();
                    System.out.println("Invertido: " + Recursividad.invertir(n4));
                    break;
                case 5:
                    System.out.print("Ingrese número: ");
                    int n5 = sc.nextInt();
                    System.out.println("Suma dígitos: " + Recursividad.sumaDigitos(n5));
                    break;
                case 6:
                    System.out.print("Base: ");
                    int base = sc.nextInt();
                    System.out.print("Exponente: ");
                    int exp = sc.nextInt();
                    System.out.println("Potencia: " + Recursividad.potencia(base, exp));
                    break;
                case 7:
                    System.out.print("M: ");
                    int m = sc.nextInt();
                    System.out.print("N: ");
                    int n7 = sc.nextInt();
                    System.out.println("MCD: " + Recursividad.mcd(m, n7));
                    break;
                case 8:
                    System.out.print("Dividendo: ");
                    int a = sc.nextInt();
                    System.out.print("Divisor: ");
                    int b = sc.nextInt();
                    System.out.println("Cociente: " + Recursividad.cociente(a, b));
                    break;
                case 9:
                    System.out.print("A: ");
                    int a9 = sc.nextInt();
                    System.out.print("B: ");
                    int b9 = sc.nextInt();
                    System.out.println("Multiplicación: " + Recursividad.multiplicacion(a9, b9));
                    break;
                case 10:
                    System.out.print("Tamaño del arreglo: ");
                    int tam = sc.nextInt();
                    int[] arr = new int[tam];
                    for (int i = 0; i < tam; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Suma arreglo: " + Recursividad.sumaArreglo(arr, 0));
                    break;
                case 11:
                    System.out.print("Filas: ");
                    int filas = sc.nextInt();
                    System.out.print("Columnas: ");
                    int cols = sc.nextInt();
                    int[][] mat = new int[filas][cols];
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            mat[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("Suma matriz: " + Recursividad.sumaMatriz(mat, 0, 0));
                    break;
                case 12:
                    System.out.print("Límite: ");
                    int lim = sc.nextInt();
                    System.out.print("Serie Fibonacci: ");
                    Recursividad.imprimirFibonacci(lim);
                    break;
                case 13:
                    System.out.print("m: ");
                    int mA = sc.nextInt();
                    System.out.print("n: ");
                    int nA = sc.nextInt();
                    System.out.println("Ackerman: " + Recursividad.ackerman(mA, nA));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}