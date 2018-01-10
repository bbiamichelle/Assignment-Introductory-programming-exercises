package com.thougthworks;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( " digite um número ");
        int r = scan.nextInt();

        for (int n = r; n > 0; n--){
            System.out.println( "*" );
        }
    }
}
