/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Passwordvalidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the username?");
        String usernameString = input.nextLine();

        System.out.print("What is the password?");
        String passwordString = input.nextLine();


        if(passwordString.equals("abc$123")){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }

    }
}
