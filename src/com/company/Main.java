package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long whidth = scan.nextInt();
        long leight = scan.nextInt();
        long plitka = scan.nextInt();
        long m = whidth / plitka;
        long n = leight / plitka;
        if (whidth % plitka != 0) m++;
        if (leight % plitka != 0) n++;
        System.out.println(n * m);
    }
}
