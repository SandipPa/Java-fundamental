package classdefs;

import java.util.ArrayList;
import java.util.List;

public class Student extends Object {

    private String name = "Unset";
    private double gpa;
    private List<String> courses;

    {
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public Student(String name, double gpa) {
        super();
        this.name = name;
        this.gpa = gpa;
    }

    public Student(String name, double gpa, String... courses) {
        this(name, gpa);
        System.out.println("Number is " + getNumber());
        for (String c : courses) {
            this.courses.add(c);
        }
    }

    final public int getNumber() {
        return 42;
    }
    
    @Override
    public String toString() {
        return "Student, name = " + name + " grade " + gpa + " courses " + courses;
    }
}
