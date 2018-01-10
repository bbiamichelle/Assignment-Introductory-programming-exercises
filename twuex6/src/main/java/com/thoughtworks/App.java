package com.thoughtworks;

public class App {
    public static void main(String[] args) {

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