package com.bridgelabz.basic;

import java.util.Scanner;

public class HarmonicNumber {
        public static void main(String[] args) {
            int N=0;
            double H=1;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter The Harmonic Value \nN = ");
            N=scanner.nextInt();
            while (N == 0 ){
                System.out.print("Enter Valid Harmonic Value \nN = ");
                N=scanner.nextInt();
            }
            for (int i = 2; i <= N; i++) {
                H=H+(1/(double)i);
            }
            System.out.println(N+" th Harmonic number = "+H);
        }
}
