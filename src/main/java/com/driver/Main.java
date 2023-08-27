package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();//call the class by object

        //set the name
        rwOnly.setName("Tony Stark");

        //get the name
        System.out.println("Name: " + rwOnly.getName());
    }
}