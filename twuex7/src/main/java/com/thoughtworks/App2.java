package com.thoughtworks;

public class App2 {
    public static void main(String[] args) {

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