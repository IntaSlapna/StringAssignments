package com.company;

public class Assignment3 {
    public static void main(String[] args) {
        String name = "John";
        if (name.matches("[A-Za-z]+"))
            System.out.println("The variable consists of following letters: " +name);
        else
            System.out.println("Wrong format, try again!");



        String username = "s20surname";
        if (username.matches("[a-z]{1}[0-9]{2}[a-z]+"))
            System.out.println("The username is accepted!");
        else
            System.out.println("Wrong username, try another!");



        String personCodeOfLatvian = "121200-11311";
        if (personCodeOfLatvian.matches("[0-9]{6}[-]{1}[0-9]{5}"))
            System.out.println("The personal code is accepted!");
        else
            System.out.println("The personal code is wrong, try again!");
    }
}
