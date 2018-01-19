package main.java.com.thoughtworks;

import java.util.Scanner;

public class DiamondExercises {

    public void printIsoscelesTriangle () {

        Scanner scan = new Scanner(System.in);
        System.out.print( " digite um número ");

        int r = scan.nextInt();

        for (int n = 1; n <= r; n++) {
            int q = getQuantidadeDeAst(n);
            int g = getQuantidadeDeEspacos(r,n);
            imprimiQuantidadeDeCaracter(g," ");
            imprimiQuantidadeDeCaracter(q,"*");
            System.out.println("");

        }

    }

    public void printDiamond () {

        int r = 3;
        for (int n = 1; n <= r; n++) {
            int q = getQuantidadeDeAst(n);
            int g = getQuantidadeDeEspacos(r,n);
            imprimiQuantidadeDeCaracter(g," ");
            imprimiQuantidadeDeCaracter(q,"*");
            System.out.println("");

        }

        for (int m = r - 1 ; m > 0; m--){
            int a = getQuantidadeDeAst(m);
            int b = getQuantidadeDeEspacos(r,m);
            imprimiQuantidadeDeCaracter(b, " ");
            imprimiQuantidadeDeCaracter(a, "*");
            System.out.println("");

        }
    }

    public void printDiamondWithName (){

        int r = 3;
        int index = 1;
        int incremento = 1;
        while(index > 0){

            int q = getQuantidadeDeAst(index);
            int g = getQuantidadeDeEspacos(r,index);
            if(index == r){
                System.out.print("Bill");
                incremento = -1;
            } else {
                imprimiQuantidadeDeCaracter(g," ");
                imprimiQuantidadeDeCaracter(q,"*");
            }
            System.out.println("");

            index += incremento;
        }
    }

    private static int getQuantidadeDeAst(int n) {
        return 1 + 2 * (n - 1);
    }

    private static int getQuantidadeDeEspacos (int r, int n){
        return (getQuantidadeDeAst(r) - getQuantidadeDeAst(n)) / 2;
    }

    private static void imprimiQuantidadeDeCaracter(int q, String character) {
        for (int x = 0; x < q; x ++) {
            System.out.print( character);
        }
    }

}
