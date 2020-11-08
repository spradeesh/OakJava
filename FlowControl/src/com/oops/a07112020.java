package com.oops;

import java.util.Scanner;

public class a07112020 {

    public static void main(String[] args) {

        Double number, sum = 0.0;
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            // takes input from the user
            number = input.nextDouble();

            // if number is negative
            // continue statement is executed
            if (number <= 0.0) {
                continue;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }

}
