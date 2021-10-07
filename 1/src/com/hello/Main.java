package com.hello;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int i = string.length();
        int j = string.length();
        if (string.length() % 2 == 0) {
            for (i = string.length() / 2 - 1; i >= 0; i--) {
                System.out.print(string.charAt(i));
            }
            System.out.println();
            for (j = string.length() / 2; j < string.length(); j++) {
                System.out.print(string.charAt(j));
            }
            System.out.println();
            if (i == j) {
                System.out.println("ура");
            } else {
                System.out.println("не ура");
            }
        } else {
            System.out.println("число не парное");
        }

    }

}

