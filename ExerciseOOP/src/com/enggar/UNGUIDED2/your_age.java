/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.UNGUIDED2;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class your_age {
    public static int Old(int birth){
        int result = 2021-birth;
        return result;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Enter your birth year here => ");
        int year = in.nextInt();

        System.out.println("Your current age based on your birth year is : " + Old(year));
    }
}
