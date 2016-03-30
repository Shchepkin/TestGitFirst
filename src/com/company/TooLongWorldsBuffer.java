package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TooLongWorldsBuffer {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStrings = Integer.parseInt(reader.readLine());

        String[] string = new String[numberOfStrings];

        for (int i = 0; i < numberOfStrings; i++)
            string[i] = reader.readLine();

        for (int i = 0; i < numberOfStrings; i++) {
            if (string[i].length() > 10) {
                String firstChar = Character.toString(string[i].charAt(0));
                String lastChar = Character.toString(string[i].charAt(string[i].length() - 1));
                System.out.println(firstChar + (string[i].length() - 2) + lastChar);
            } else System.out.println(string[i]);
        }
    }
}
