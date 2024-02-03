package com.bridgelabz.practicedayone;

public class poweroftwo {
    public static void main(String[] args) {
        int n = 24;
        int twopower = 2^n;
        if(twopower%400==0)
            System.out.println("leap year");
        else
            System.out.println("notleapyear");
    }
}
