package com.exercises.a02_passing_time;

import java.util.Scanner;

public class Main {

    /* <summary>
            INSTRUCTIONS:
                A watchmaker has asked you to code a program to help the user get a better sense
                of how time passes.  The user will provide a number of centuries and the program
                has to output the number of centuries, years, days, hours and minutes (see format below).

            HINT:
                * You're gonna have to google how many EXACT days in a year
                * See if you can calculate seconds as well; may be a bit harder

            EXAMPLE:
       
                |   INPUT     | OUTPUT                     |
                |------------------------------------------|
                | 10 (siglos) |   Siglos: 10               |
                |             |   = 1,000 years             |
                |             |   = 365,242 days           |
                |             |   = 8,765,808 hours        |
                |             |   = 525,948,480 minutes    |
                |------------------------------------------|

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t***** THE PASSING OF TIME *****");
        System.out.print("Please enter number of centuries: ");
        int centuries = scan.nextInt();

        //do calculations here

        //output here
        System.out.println(centuries + " centuries");
        //years
        //days
        //mins
        //secs
    }
}
