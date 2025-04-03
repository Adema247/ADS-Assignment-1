public class Tasks {

    // Problem 1: Minimum value in array
    public static int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Problem 2: Average of array
    public static double findAverage(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
    }

    // Problem 3: Check if n is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Problem 4: Factorial using recursion
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Problem 5: Fibonacci using recursion
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6: a^n using recursion
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Problem 7: Reverse input using recursion (no array)
    public static void reverse(int n, java.util.Scanner scanner) {
        if (n == 0) return;
        int x = scanner.nextInt();
        reverse(n - 1, scanner);
        System.out.print(x + " ");
    }

    // Problem 8: Check if string contains only digits
    public static boolean isDigitsOnly(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    // Problem 9: Binomial coefficient C(n, k)
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    // Problem 10: GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
