/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author simon
 */
public class AList {
    public static void breakMyList(List l) {
        l.add(0, LocalDate.now());
    }
    public static void main(String[] args) {
        Class cl = "".getClass();
        cl = String.class;
        
        List <String> ls = new ArrayList<>();
        ls.add("Fred");
        ls.add("Jim");
        ls.add("Sheila");
        
        ls = Collections.checkedList(ls, cl);
        
        for (String st : ls) System.out.println("> " + st);
        
//        ls.add(LocalDate.now());
        breakMyList(ls);
        System.out.println("Item at index 1 is " + ls.get(1));
        
        System.out.println("Contains Alan? " + ls.contains("Alan"));
        
        Object s = ls.get(0);
        for (String st : ls) System.out.println("> " + st);
    }
}
