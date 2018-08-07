package classdefs;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {
        List<Student> school = new ArrayList<>();
        school.add(new Student("Fred", 3.7));
        school.add(new Student("Jim", 2.7));
        school.add(new Student("Sheila", 3.9, "Math", "Astrophysics", "Quantum mechanics"));
        school.add(new VIPStudent("Donald", 1.9, 10_000_000));
        
        for (Student s : school) {
            System.out.println("> " + s);
        }
    }
}
