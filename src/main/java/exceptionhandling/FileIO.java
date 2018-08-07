/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class NoMoneyException extends Exception {

    public NoMoneyException() {
    }

    public NoMoneyException(String message) {
        super(message);
    }

    public NoMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoneyException(Throwable cause) {
        super(cause);
    }

    public NoMoneyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

public class FileIO {
    public static void main(String[] args) /*throws IOException*/ {
        try {
            doStuff();
        } catch (NoMoneyException ex) {
            System.out.println("You're broke!");
            ex.printStackTrace();
        }
    }
    public static void doStuff() throws NoMoneyException {
        try (Scanner sc = new Scanner(new FileReader("datax.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println("> " + sc.nextLine());
            }
            System.out.println("Finished...");
        } catch (IOException ioe) {
            System.out.println("IOE!!!");
            throw new NoMoneyException("You don't have that money", ioe);
        } finally {
            System.out.println("In my finally");
        }
    }
}
