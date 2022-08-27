package com.bridgelabz.basic;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter devident : ");
        int devident=scanner.nextInt();
        System.out.print("enter divisior : ");
        int divisior=scanner.nextInt();

        int quotient=devident/divisior;
        System.out.println("Quotient = "+quotient);

        int remainder=devident%divisior;
        System.out.println("Remainder = "+remainder);
    }
}
