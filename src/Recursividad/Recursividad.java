package Recursividad;

public class Recursividad {

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n debe ser >= 0");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static int sumatoriaHasta(int n) {
        if (n <= 0) return 0;
        return n + sumatoriaHasta(n - 1);
    }
    public static double sumatoriaFracciones(int n) {
        if (n <= 0) return 0;
        return 1.0 / n + sumatoriaFracciones(n - 1);
    }
    public static int invertir(int n) {
        return invertirAux(n, 0);
    }
    private static int invertirAux(int n, int acum) {
        if (n == 0) return acum;
        return invertirAux(n / 10, acum * 10 + n % 10);
    }
    public static int sumaDigitos(int n) {
        if (n == 0) return 0;
        return n % 10 + sumaDigitos(n / 10);
    }
    public static long potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }
    public static int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }
    public static int cociente(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        if (a < b) return 0;
        return 1 + cociente(a - b, b);
    }
    public static int multiplicacion(int a, int b) {
        if (a == 0 || b == 0) return 0;
        if (b < 0) return -multiplicacion(a, -b);
        return a + multiplicacion(a, b - 1);
    }
    public static int sumaArreglo(int[] arr, int indice) {
        if (indice == arr.length) return 0;
        return arr[indice] + sumaArreglo(arr, indice + 1);
    }
    public static int sumaMatriz(int[][] mat, int fila, int col) {
        if (fila == mat.length) return 0;
        if (col == mat[fila].length) return sumaMatriz(mat, fila + 1, 0);
        return mat[fila][col] + sumaMatriz(mat, fila, col + 1);
    }
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void imprimirFibonacci(int limite) {
        for (int i = 0; i <= limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    public static int ackerman(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackerman(m - 1, 1);
        return ackerman(m - 1, ackerman(m, n - 1));
    }
}