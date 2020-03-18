package tryingAlgorithms;

public class recursiveAlgorithms {

    // Factorial de n entero positivo >= 0
    public static long factorial(long n) {
        if (n <= 1) { // caso base
            return 1;
        }

        return n * factorial(n - 1); // paso recursivo
    }

    // n numero Fibonacci
    public static int fibonacci(int n) {

        if (n <= 1) {// casos base para n == 1 && n == 0
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2); //paso recursivo

    }

    public static void main(String[] args) {

        // Calculo del factorial de un numero, se recomienda usar long para evitar
        // desbordamiento y perdida de datos.
        // System.out.println(factorial(14));

        // System.out.println(fibonacci(3));

    }

}