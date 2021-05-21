/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggar.UNGUIDED3;

/**
 *
 * @author Lenovo
 */
public class Bookstore { //declaring main class
    public static void book(String[] args) {
        Novel[] array = new Novel[3]; //making array object from class
        Novel product1 = new Novel(); //making object from class
        product1.setWriter("The Felowship Of Ring"); //initializing variable value
        product1.setGenre("Adventure, Magic, Fantasy");
        product1.setYear(1954);

        Novel product2 = new Novel("Blue Moon", "Adventure, Action", 2018);
        Novel product3 = new Novel("Antares", "School, Romance", 2020);
        Novel product4 = new Novel("Save Me", "Horror", 2021);

        array[0] = product1; //initializing array variable value
        array[1] = product2;
        array[2] = product3;
        array[3] = product4;

        System.out.println("Novel Description :\n");

        for(Novel x : array) { //looping
            System.out.println("Write by: " + x.getWriter());
            System.out.println("Genre: " + x.getGenre());
            System.out.println("Published : " + x.getYear() + "\n");
        }
    }
}
