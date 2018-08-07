/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested;

/**
 *
 * @author simon
 */
public class UseStudent {
    public static void main(String[] args) {
        Student s = Student.builder()
                .name("Donald")
                .gpa(3.8)
                .course("Math")
                .course("Physics")
                .build();
        System.out.println("Student is " + s);
    }
}
