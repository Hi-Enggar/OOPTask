/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.guided2;

/**
 *
 * @author Lenovo
 */
public class DemoFunction {
    public static void main(String[] args) {
        drawTriangle(7);
        drawRectangle(5, 4);
    }
    
    public static void drawTriangle(int length) {
        //nestd loop
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void drawRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

