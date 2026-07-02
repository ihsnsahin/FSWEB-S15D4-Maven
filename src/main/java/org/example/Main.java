package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean checkForPalindrome (String text) {
        String[]  word  = text.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z0-9]", "").split("");

        List<String> characters = new ArrayList<>(Arrays.asList(word));
        List<String> reversedCharacters = new ArrayList<>(characters);
        Collections.reverse(reversedCharacters);

        return characters.equals(reversedCharacters);
    }
    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        List<String> binaryList = new ArrayList<>();
        while (number > 0) {
            binaryList.add(String.valueOf(number % 2));
            number = number/2;
        }
        Collections.reverse(binaryList);
        String binary = "";
        for (int i = 0; i < binaryList.size(); i++) {
            binary += binaryList.get(i);
        }
        return binary;
    }
}