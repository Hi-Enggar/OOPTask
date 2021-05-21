/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.guided4b;

/**
 *
 * @author Lenovo
 */

public class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public String getType() {
        return "Cat";
    }
    
    @Override
    public String playSound() {
        return "Meow~!";
    }
}
