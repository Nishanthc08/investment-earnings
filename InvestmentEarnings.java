package com.practice;

import java.text.*;
import java.util.Scanner;

public class InvestmentEarnings {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");

        // Read the buying price per share entered by the user
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice = 0.1;

        // Continuous loop to input closing prices for each day
        while(true) {
            System.out.println("Enter the closing price for day: " + day + " (any negative value to leave):");
            closingPrice = sc.nextDouble();
            
            // Check if the user entered a negative value to exit the loop
            if(closingPrice < 0.0) 
                break;
            
            // Calculate earnings per share
            double earnings = closingPrice - buyingPrice;
            DecimalFormat df = new DecimalFormat("0.00");

            // Print earnings per share based on the comparison of closing price and buying price
            if (earnings > 0) {
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");
            }
            else if(earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
            }
            else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }
            day++; // Increment the day counter
        }
        sc.close(); // Close the Scanner object to avoid resource leak
    }
}
