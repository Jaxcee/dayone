package com.bridgelabz.practicedayone;
import java.util.Random;
public class Coinflip {
    public static void main(String[] args) {
        int flips=1000;
        Random Random = new Random();
        int heads=0;
        int tails=0;
        for(int i=0;i<flips;i++);
        if(Random.nextDouble()<0.5) {
            heads++;
        }
        else{
            tails++;
            }
        double headspercentage = (double)heads/flips*100;
        double tailspercentage =(double)tails/flips*100;
        System.out.println(headspercentage);
        System.out.println(tailspercentage);
        }
    }


