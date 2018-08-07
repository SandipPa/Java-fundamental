/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sf.indy;

import java.time.LocalDate;
import static java.lang.System.out;
/**
 *
 * @author simon
 */
public class Hello {
    public static void main(String... args) {
        System.out.println("Args are " + args[0] + " , " + args[1]);
        System.out.println("today is " + LocalDate.now());
        
        double fahr = 98.4;
        double celc = 5 * (fahr - 32) / 9;
        out.println("The temperature " + fahr + " fahrenheit is equal to " + celc + " celcius");
        out.printf("The temperature %6.3f fahrenheit is equal to %6.3f celcius\n", fahr, celc);
        System.out.println("Hello " + 1 + 2 + 3);
        System.out.println(1 + 2 + 3 + " Hello ");
    }
}

//class Other {}
