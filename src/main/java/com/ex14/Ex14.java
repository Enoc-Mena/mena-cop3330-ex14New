/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex14;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        String state;
        String stateCompare = "WI";
        double orderAmount, subTotal, taxes, total;

        //Order amount
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        orderAmount = scan.nextDouble();

        //State of customer
        Scanner scan2 = new Scanner(System.in);
        System.out.print("What is the state? ");
        state = scan2.nextLine();

        //Output if customer from WI
        if(state.equalsIgnoreCase(stateCompare)) {

            taxes = 5.5/100;
            double newOrderAmount = orderAmount * taxes;
            total =  orderAmount + newOrderAmount;

            System.out.print("Your subtotal is $" + orderAmount);
            System.out.println("");
            System.out.print("Your tax is $" + newOrderAmount);
            System.out.println("");
            System.out.print("The total is $" + total);

            System.exit(0);

        }

        //Output if not from WI
        System.out.print("Your subtotal is $" + orderAmount);
        System.out.println("");
        System.out.print("Your tax is $0");
        System.out.println("");
        System.out.print("The total is $" + orderAmount);

    }

}
