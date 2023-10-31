package org.rohit;

//This is the Core Java Example where Raju is dependent on Rani to
//get the number, Here we are creating obj by using
// new keyword, I will create this core java into
//Spring framework application where I will explain how to create objects
//without new keyword and what are the benefits of it.
public class Main {
    public static void main(String[] args) {
        Raju raju = new Raju();
        System.out.println(raju.Number());
    }
}