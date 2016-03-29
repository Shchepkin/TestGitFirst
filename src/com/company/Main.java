package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int whidth = scan.nextInt();
        int leight = scan.nextInt();
        int plitka = scan.nextInt();
        int m = whidth/plitka;
        int n = leight/plitka;
        if (whidth % plitka != 0) m++;
        if (leight % plitka != 0) n++;
        System.out.println(n*m);
    }
}
