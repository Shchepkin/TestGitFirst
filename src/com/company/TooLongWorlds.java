package com.company;

import java.util.Scanner;

public class TooLongWorlds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfStrings = scan.nextInt();
        String[] str = new String[numberOfStrings];

        for (int i = 0; i < numberOfStrings; i++)
            str[i] = scan.nextLine();

        for (int i = 0; i < numberOfStrings; i++)
            System.out.println("str[" + i + "] = " + str[i]);
        //======================================================================
        System.out.println();
        System.out.println("Second cycle starts");
        String[] string = new String[numberOfStrings];

        for (int i = 0; i < numberOfStrings; i++)
            string[i] = scan.nextLine();

        for (int i = 0; i < numberOfStrings; i++) {
            if (string[i].length() > 10) {
                String firstChar = Character.toString(string[i].charAt(0));
                String lastChar = Character.toString(string[i].charAt(string[i].length() - 1));
                System.out.println(firstChar + (string[i].length() - 2) + lastChar);
            } else System.out.println(string[i]);
        }

    }
}
