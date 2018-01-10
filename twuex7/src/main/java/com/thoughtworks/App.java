package com.thoughtworks;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print( " digite um número ");
        int r = scan.nextInt();

        Scanner ler = new Scanner(System.in);
        System.out.println(" digite um nome");
        String nome = ler.nextLine();

        int index = 1;
        int incremento = 1;
        while(index > 0){

            int q = getQuantidadeDeAst(index);
            int g = getQuantidadeDeEspacos(r,index);
            if(index != r){
                imprimiQuantidadeDeCaracter(g," ");
                imprimiQuantidadeDeCaracter(q,"*");
            }

            if(index == r){
                imprimiQuantidadeDeCaracter((getQuantidadeDeAst(r) - nome.length()) / 2, " ");
                System.out.print( nome );
                incremento = -1;
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