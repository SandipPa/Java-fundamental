package nested;

import java.util.ArrayList;
import java.util.List;

public class Student {
private String name;
private double gpa;
private List<String> courses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public List<String> getCourses() {
        return courses;
    }

    private Student() {}
    
    public static class Builder {
        private Student target = new Student();
        private Builder() {}
        
        public Builder name(String s) {
            target.name = s;
            return this;
        }
        public Builder gpa(double gpa) {
            target.gpa = gpa;
            return this;
        }
        public Builder course(String course) {
            target.courses.add(course);
            return this;
        }
        
        public Student build() {
            Student.validate(target);
            return target;
        }
    }
    public static Builder builder() {
        return new Builder();
    }
    private static void validate(Student s) {
        if (s.name == null || s.gpa < 0 || s.gpa > 4) 
            throw new IllegalArgumentException("Bad values");
    }
}
