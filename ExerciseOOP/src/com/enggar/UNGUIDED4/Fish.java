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
public class Fish {

    private final int sizeInft;
    private final String getMove;
    private final boolean canEat;
   
    public Fish(int sizeInft, String getMove, boolean canEat){
        this.sizeInft = sizeInft;
        this.getMove = getMove;
        this.canEat = canEat;
    }
    
    public int setSizeInft(){
        return this.sizeInft;
    }
    
    public String getMove() {
        return "Swim~~";
    }
    
    public boolean canEat() {
        return true;
    }
}
