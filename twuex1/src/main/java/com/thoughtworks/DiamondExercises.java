package main.java.com.thoughtworks;

import java.util.Scanner;

public class DiamondExercises {

    public void printIsoscelesTriangle () {

        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter a number");

        int answer = scan.nextInt();

        for (int counter = 1; counter <= answer; counter++) {
            int quantityAsterisk = getQuantityAsterisk(counter);
            int quantitySpace = getQuantitySpace(answer,counter);
            printQuantityCharacter(quantitySpace," ");
            printQuantityCharacter(quantityAsterisk,"*");
            System.out.println("");
        }
    }

    public void printDiamond () {

        int numberLines = 3;
        for (int counter = 1; counter <= numberLines; counter++) {
            int quantityAsterisk = getQuantityAsterisk(counter);
            int quantitySpace = getQuantitySpace(numberLines,counter);
            printQuantityCharacter(quantitySpace," ");
            printQuantityCharacter(quantityAsterisk,"*");
            System.out.println("");

        }

        for (int counter = numberLines - 1 ; counter > 0; counter--){
            int quantityAsterisk = getQuantityAsterisk(counter);
            int quantitySpace = getQuantitySpace(numberLines,counter);
            printQuantityCharacter(quantitySpace, " ");
            printQuantityCharacter(quantityAsterisk, "*");
            System.out.println("");
        }
    }

    public void printDiamondWithName (){

        int numberLine = 3;
        int index = 1;
        int increase = 1;
        while(index > 0){

            int quantityAsterisk = getQuantityAsterisk(index);
            int quantitySpace = getQuantitySpace(numberLine,index);
            if(index == numberLine){
                System.out.print("Bill");
                increase = -1;
            } else {
                printQuantityCharacter(quantitySpace," ");
                printQuantityCharacter(quantityAsterisk,"*");
            }
            System.out.println("");

            index += increase;
        }
    }

    private static int getQuantityAsterisk(int numberLine) {
        return 1 + 2 * (numberLine - 1);
    }

    private static int getQuantitySpace(int quantityBeforeWord, int quantityAfterWord){
        return (getQuantityAsterisk(quantityBeforeWord) - getQuantityAsterisk(quantityAfterWord)) / 2;
    }

    private static void printQuantityCharacter(int quantityCharacter, String character) {
        for (int counter = 0; counter < quantityCharacter; counter ++) {
            System.out.print( character);
        }
    }

}
