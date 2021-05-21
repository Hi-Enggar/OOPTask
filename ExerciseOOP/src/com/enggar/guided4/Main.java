/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.guided4;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.talk();
        c.name = "Merlin";
        c.talk();
    }
}
