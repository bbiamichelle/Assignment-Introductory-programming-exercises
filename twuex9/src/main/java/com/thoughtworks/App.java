package com.thoughtworks;

import java.util.Scanner;

public class App
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( " digite um número ");
        int n = scan.nextInt();
        primeFactors(n);
    }

    public static void primeFactors(int n) {

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
           System.out.print(n);
        }



    }




  //  private static boolean ehPrimo(int p) {
  //      for (int i = p - 1; i > 1; i--){
  //          if ( p % i == 0) {
  //              return false;
