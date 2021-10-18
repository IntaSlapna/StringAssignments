package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        String[] arr = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        startsC(arr);
        endsE(arr);
        lenght(arr);
        containsE(arr);
        containsTE(arr);
        histogram(arr);
    }

    public static void startsC(String[] arr) {
        int count = 0;
        for (String c : arr) {
            if (c.startsWith("C"))
                count++;
        }
        System.out.println("The number of values which starts with 'C' equals: " + count);
    }

    public static void endsE(String[] arr) {
        int count = 0;
        for (String e : arr) {
            if (e.endsWith("e"))
                count++;
        }
        System.out.println("The number of values which ends with 'e' equals: " + count);
    }

    public static void lenght(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 5)
                count++;
        }
        System.out.println("The number of values which consists if 5 letters equals: " + count);
    }

    public static void containsE(String[] arr) {
        int count = 0;
        for (String e : arr) {
            if (e.contains("e"))
                count++;
        }
        System.out.println("The number of values which contains 'e' equals: " + count);
    }

    public static void containsTE(String[] arr) {
        int count = 0;
        for (String te : arr) {
            if (te.contains("te"))
                count++;
        }
        if (count>0)
            System.out.println("The number of values which contains 'te' equals: " + count);
        else
            System.out.println("There is no values which contains substring 'te'.");
    }

    public static void histogram (String [] arr) {
        int numberofword = 0;
        while (numberofword <= arr.length) {
            int count1 = 0;
            for (String word:arr) {
                int stringlenght = word.length();
                if (stringlenght == numberofword)
                    count1++;
                }
            System.out.println(count1 + "values have " + numberofword + "letters");
            numberofword++;
            }

        }

    }
