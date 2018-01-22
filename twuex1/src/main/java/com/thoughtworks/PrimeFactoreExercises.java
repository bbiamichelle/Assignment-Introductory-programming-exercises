package main.java.com.thoughtworks;

import java.util.Scanner;

public class PrimeFactoreExercises {

    public void printPrimeFactorsExercises() {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter a number");
        int answer = scan.nextInt();
        primeFactors(answer);
    }

    private static void primeFactors(int numberProvided) {

        while (numberProvided % 2 == 0) {
            System.out.print(2 + " ");
            numberProvided /= 2;
        }

        for (int counter = 3; counter <= Math.sqrt(numberProvided); counter += 2) {
            while (numberProvided % counter == 0) {
                System.out.print(counter + " ");
                numberProvided /= counter;
            }
        }

        if (numberProvided > 2) {
            System.out.print(numberProvided);
        }
    }
}
