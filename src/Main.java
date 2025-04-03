import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int[] arr2 = {3, 2, 4, 1};

        System.out.println("Min: " + Tasks.findMin(arr, 5));
        System.out.println("Avg: " + Tasks.findAverage(arr2, 4));
        System.out.println("Is 7 prime: " + Tasks.isPrime(7));
        System.out.println("Factorial(5): " + Tasks.factorial(5));
        System.out.println("Fibonacci(5): " + Tasks.fibonacci(5));
        System.out.println("Power(2, 10): " + Tasks.power(2, 10));

        System.out.print("Reverse 4 elements: ");
        Scanner scanner = new Scanner("1 4 6 2");
        Tasks.reverse(4, scanner);
        System.out.println();

        System.out.println("Digits only (123456): " + Tasks.isDigitsOnly("123456"));
        System.out.println("Digits only (123a12): " + Tasks.isDigitsOnly("123a12"));

        System.out.println("C(7, 3): " + Tasks.binomial(7, 3));
        System.out.println("GCD(32, 48): " + Tasks.gcd(32, 48));
    }
}