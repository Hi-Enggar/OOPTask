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
public class Novel { //declaring class
    private String writer, genre; //declaring variables with string type of data
    private int year; //declaring variable with int type of data

    public Novel() {} //constructure

    public Novel(String manufacturer, String model, int year) { //constructure
        this.writer = writer;
        this.genre = genre;
        this.year = year;
    }

    public String getWriter() { //getter method
        return writer; //returning variable value
    }

    public void setWriter(String manufacturer) { //setter method
        this.writer = writer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String model) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
