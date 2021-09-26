package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

public class ex30 {

      public static void main(String[] Args){

          int i, j;

            for (i = 1; i < 13; i++) {

                System.out.printf("%2d", i);

                for (j = 2; j < 13; j++) {
                   System.out.print(" ");
                   System.out.printf("%3d", (i*j));
                   }
                System.out.println(" ");
            }

      }



}
