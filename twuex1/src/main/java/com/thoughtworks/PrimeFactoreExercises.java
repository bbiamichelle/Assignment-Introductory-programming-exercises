package main.java.com.thoughtworks;

import java.util.Scanner;

public class PrimeFactoreExercises {

    public void printPrimeFactorsExercises() {

        Scanner scan = new Scanner(System.in);
        System.out.print(" digite um número ");
        int n = scan.nextInt();
        primeFactors(n);
    }

    private static void primeFactors(int n) {

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}
