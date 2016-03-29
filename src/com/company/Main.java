package com.company;

public class Main {

    public static void main(String[] args) {
	    int plitka = 2;
        int whidth = 5;
        int leight = 7;
        int m = whidth/plitka;
        int n = leight/plitka;
        if (whidth % plitka != 0) m++;
        if (leight % plitka != 0) n++;
            System.out.println(n*m);
    }
}
