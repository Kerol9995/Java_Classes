package com.Kerol9995;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LearnEpam {
    public static void main(String[] args ) throws IOException {
        String str1;
        int number;
        int number1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your name:");
        str1 = br.readLine();
        System.out.println("Hello " + str1 + " !!!");
        System.out.print("Inverted: ");
        for( int i = str1.length() - 1 ; i >= 0 ; i--) {
            System.out.print(str1.charAt(i));
        }

        System.out.println("\nInput number(1-10):");
        number = Integer.parseInt(br.readLine());
        Random random = new Random ( ) ;
        for (int i = 1; i<=number ; i++) {
            System.out.println("Random" + i + " " + random.nextInt(10) );
        }
        for (int i = 1; i<=number ; i++) {
            System.out.print("Random" + i + " " + Math.random()+ " ");
        }

        System.out.println("\nEnter the first number: ");
        number = Integer.parseInt(br.readLine());
        System.out.println("Enter the second number: ");
        number1 = Integer.parseInt(br.readLine());
        System.out.println("number1 + number2 = " + Math.addExact(number, number1));
        System.out.println("number1 * number2 = " + Math.multiplyExact(number, number1));

        System.out.println("\nEnter month number: ");
        number = Integer.parseInt(br.readLine());
        if (number > 0 && number < 13) {
            switch (number) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
        else System.out.println("Invalid number");
    }
}
