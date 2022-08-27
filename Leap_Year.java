package com.bridgelabz.basic;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter year : ");

        year = scanner.nextInt();
        while (year < 999 || year > 9999) {
            System.out.print("Opps...year is not valid \nEnter 4 digit number for year : ");
            year = scanner.nextInt();
        }

        if ((year % 2) == 0) {
            System.out.println(year + " is leap year");
        }
        else
        {
            System.out.println(year + " is not leap year");
        }
    }
}

