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
public class TestPass {
    int number1, number2;

    // Constructor
    public TestPass(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Passed by value
    // depends on what we needed
    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    // Passed by reference
    void calculate(TestPass tp) {
        tp.number1 = tp.number1 * 10;
        tp.number2 = tp.number2 / 2;
    }
}
