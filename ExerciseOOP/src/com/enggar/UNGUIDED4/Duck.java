/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.UNGUIDED4;

/**
 *
 * @author Lenovo
 */
public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }
    
    public String getColour() {
        return "Yellow";
    }
    
    public String getMove() {
        return "Swim~~";
    }
    
    public String playSound() {
        return "Quack~!";
    }
}
