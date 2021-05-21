/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.UNGUIDED;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class unguided1 {
    public static void main(String[] args) {

        Scanner evenOdd = new Scanner(System.in);
        System.out.print("Welcome!!");

        System.out.print("Enter a number here =>  ");
        int num = evenOdd.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is an EVEN NUMBER");
        else
            System.out.println(num + " is an ODD NUMBER");
        System.out.print("Thank you :) ");
    }
}
