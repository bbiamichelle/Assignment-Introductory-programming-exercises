package main.java.com.thoughtworks;

import java.util.Scanner;

public class TriangleExercises {

    public void printAsterisk () {

        System.out.println( "*" );

    }

    public void printHorizontalLine (){

            Scanner scan = new Scanner(System.in);
            System.out.print( " digite um número ");
            int r = scan.nextInt();

            for (int n = r; n > 0; n--){
                System.out.print( "*" );
            }
    }

}


