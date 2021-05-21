/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.UNGUIDED5;

/**
 *
 * @author Lenovo
 */
public class Love_Yourself { //declaring parent class
    void intro() {} //overriding1 method

    void outro() {} //overriding2 method

    void solo() { //declaring overloading1 method
        System.out.println("Play >> Singularity");
        System.out.println("Play >> Epiphany");
        System.out.println("Play >> Euphoria");
        System.out.println("Play >> Serendipity");
    }

    void rapline(String unused) { //declaring overloading2 method
        System.out.println("Play >> TEAR");
        System.out.println("Play >> DDAENG");
        System.out.println("Play >> CHYPER");
    }
}

