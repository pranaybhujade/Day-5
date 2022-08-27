package com.bridgelabz.basic;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character : ");
        c = scanner.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " is Vowel");
        } else {
            System.out.println(c + " is Consonant");
        }
    }
}
