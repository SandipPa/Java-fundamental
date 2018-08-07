/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class Exceptions1 {
    public static void main(String[] args) /*throws SQLException*/ {
        try {
            doStuff();
        } catch (SQLException ex) {
            System.out.println("Main got the problem..." + ex.getMessage());
        }
        System.out.println("Main finishing normally");
    }
    
    public static void doStuff() throws SQLException {
        int x = 99;
        int y = 300;
        try {
            if (x < y) throw new SQLException("Bad numbers in tables");
        }
//        catch (SQLException se) {
//            System.out.println("Got an SQL exception ");
//            se.printStackTrace();
//        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("Finishing the method");
    }
}

