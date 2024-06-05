package com.example.primenumbers_n;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;

                }
            }
            if (j == i) {
                System.out.println(" n prime numbers is: " + i );
            }
        }
  }
}