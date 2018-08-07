/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sf.indy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;
}
/**
 *
 * @author simon
 */
public class MoreTemp {
    public static double fahrToCelc(double fahr) {
        return 5 * (fahr - 32) / 9;
    }
    public static double fahrToCelc(int fahr) {
        return 5 * (fahr - 32.0) / 9;
    }
    public static void showAll(double ... vals) {
        System.out.println("number is vals is " + vals.length);
//        int idx = 0;
//        while (idx  < vals.length) {
//            System.out.println("item at index " + idx + " is " + vals[idx]);
//            idx++;
//        }
        
//        for (int idx = 0; idx  < vals.length; idx++) {
//            System.out.println("item at index " + idx + " is " + vals[idx]);
//        }
        
        for (double d : vals) {
            System.out.println("item is " + d);
        }
        
        
    }
    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text: ");
        String line = br.readLine();
        System.out.println("You said: " + line);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter more text: ");
        line = sc.nextLine();
        System.out.println("You said: " + line);
        
        System.out.print("Enter a temperature in F ");
        double fTemp = sc.nextDouble();
        double cTemp = fahrToCelc(fTemp);
        if (cTemp < 0) {
            System.out.println("Brrr");
        } else {
            System.out.println("Well, I won't die of hypothermia just yet.");
        }
        
        String message = cTemp < 40 ? "Well, I won't die of heatstroke just yet..." : "Hmm hot!";
        System.out.println(message);
        
        switch((int)cTemp) {
            case 0: System.out.println("Freezing");
            break;
            case 100: System.out.println("Boiling");
            break;
            default: System.out.println("Nothing special");
            break;
        }
        
        Suit myCard = Suit.CLUBS;
        System.out.println("My card is a " + myCard);
        System.out.println("My card's index is a " + myCard.ordinal());
        
        int v1 = 99;
        int v2 = 100;
        int v3 = 99;
        
        if (v1 == v2) System.out.println("same (really!)");
        else System.out.println("Different");
        
        if (v1 == v3) System.out.println("same");
        else System.out.println("Different (really!)");
        
        String sv1 = "Hello";
        String sv2 = "Goodbye";
        String sv3 = new String("Hello");
        System.out.println("sv1 == sv2 is true? " + sv1 == sv2);
        System.out.println("sv1 == sv3 is true? " + sv1 == sv3);
        System.out.println("sv1.equals(sv3) is true? " + sv1.equals(sv3));
        
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println("sb1 == sb3 is true? " + (sb1 == sb3));
        System.out.println("sb1.equals(sb3) is true? " + sb1.equals(sb3));
        System.out.println("sb1.toString().equals(sb3.toString()) is true? " 
                + sb1.toString().equals(sb3.toString()));
        
    }
}
