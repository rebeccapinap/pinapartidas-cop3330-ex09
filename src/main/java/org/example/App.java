package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Conversion constant
        final double conversion = 0.002857143;

        // Calculates the gallons needed for a certain area
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();

        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();

        double f2 = length * width;
        int numGallons = (int) ((f2 * conversion) + 1);

        System.out.format("You will need to purchase %d gallons of paint to cover 360 square feet.", numGallons);
    }
}
