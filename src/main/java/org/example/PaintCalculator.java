/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class PaintCalculator {

    static public void main (String[] args){

        int conversion = 350;

        Scanner input = new Scanner(System.in);

        int length, width;

        System.out.println("What are the length and width of the room? ");
        length = input.nextInt();
        width = input.nextInt();

        int area = length * width;

        int help = area/conversion;

        if (area%conversion != 0)
            System.out.println ("You will need to purchase "+ (help+1) + " gallons of paint to cover "+ area + " square feet");
        else
            System.out.println ("You will need to purchase "+ (help) + " gallons of paint to cover "+ area + " square feet");
    }
}
