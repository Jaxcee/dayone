package com.bridgelabz.practicedayone;

public class harmonicseries {
    public static void main(String[] args) {
        int n=5;
        double result=0.0;
        while(n>0){
            result= result + (double)1/n;
            n--;
            System.out.println(result+',');
        }

    }
}
