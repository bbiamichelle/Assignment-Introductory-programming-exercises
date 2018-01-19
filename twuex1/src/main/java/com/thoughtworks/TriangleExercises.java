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

    public void printVerticalLine (){

        Scanner scan = new Scanner(System.in);
        System.out.print( " digite um número ");
        int r = scan.nextInt();

        for (int n = r; n > 0; n--){
            System.out.println( "*" );
        }

    }

    public void printRightTriangle (){

        {
            Scanner scan = new Scanner(System.in);
            System.out.print( " digite um número ");
            int r = scan.nextInt();

            for (int n = 1; n <= r; n++){
                imprimeUmaQuantidadeDeAst(n);
                imprimeUmaLinhaEmBranco();
            }
        }

    }

    private static void imprimeUmaLinhaEmBranco() {
        System.out.println("");
    }

    private static void imprimeUmaQuantidadeDeAst(int n) {
        for (int x = 0; x < n; x++){
            System.out.print("*");
        }
    }

}


