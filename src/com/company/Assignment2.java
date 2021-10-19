package com.company;

import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        String arr = "Climb mountains not so the world can see you, but so you can see the world";
        numberOfWords(arr);
        findTHE(arr);
        containS(arr);
        equalWords(arr);

    }

    public static void numberOfWords(String arr) {
        String[] words = arr.split("\\s+");
        int numOfWords = words.length;
        System.out.println("There are " + numOfWords + " of words in the array.");
    }

    public static int numberOfWords2(String arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(arr);
        return tokens.countTokens();
    }

    public static void findTHE(String arr) {
        String[] words = arr.split("\\s+");
        int count = 0;
        for (String the : words) {
            if (Objects.equals(the, "the"))
                count++;
        }
        if (count > 0)
            System.out.println("The number of words 'the' in array equals: " + count);
        else
            System.out.println("There is no words 'the' in this array.");
    }

    public static void containS(String arr) {
        String[] words = arr.split("\\s+");
        int count = 0;
        for (String s : words) {
            if (s.contains("s"))
                count++;
        }
        System.out.println(count + " words in the array contain letter 's'.");
    }

    public static void equalWords (String arr) {
        String[] words = arr.split("\\s+");
        List<String> list = Arrays.asList(words);
        Set<String> set = new HashSet<String>();
        for(String equal : list) {
            boolean flagForDuplicate = set.add(equal);
            if(!flagForDuplicate) {
                System.out.println(equal + " is duplicate element");
            }
        }
    }
}


