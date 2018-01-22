package main.java.com.thoughtworks;

import java.util.Scanner;

public class TriangleExercises {

    public void printAsterisk () {

        System.out.println( "*" );

    }

    public void printHorizontalLine (){

        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter a number");
        int answer = scan.nextInt();

        for (int counter = answer; counter > 0; counter--){
            System.out.print( "*" );
        }
    }

    public void printVerticalLine (){

        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter a number");
        int answer = scan.nextInt();

        for (int counter = answer; counter > 0; counter--){
            System.out.println( "*" );
        }
    }

    public void printRightTriangle (){

        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter a number");
        int answer = scan.nextInt();

        for (int counter = 1; counter <= answer; counter++){
            printQuantityAsterisk(counter);
            printABlankLine();
        }
    }

    private static void printABlankLine() {
        System.out.println("");
    }

    private static void printQuantityAsterisk(int quantity) {
        for (int counter = 0; counter < quantity; counter++){
            System.out.print("*");
        }
    }
}


