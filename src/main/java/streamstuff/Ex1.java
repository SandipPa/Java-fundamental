package streamstuff;

import classdefs.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Ex1 {
  public static String getLetterGrade(Student s) {
    double gpa = s.getGpa();
    if (gpa > 3.8) return "A";
    if (gpa > 3.0) return "B";
    if (gpa > 2.5) return "C";
    else return "";
  }
  public static void main(String[] args) {
    List<Student> school = new ArrayList<>();
    school.add(new Student("Fred", 3.7, "Math"));
    school.add(new Student("Freddy", 3.7, "Math"));
    school.add(new Student("Frederick", 3.2, "Math"));
    school.add(new Student("Fredina", 2.7, "Math"));
    school.add(new Student("Fredularity", 3.7, "Math"));
    school.add(new Student("Jim", 2.7, "Art", "History"));
    school.add(new Student("Sheila", 3.9, "Math", "Astrophysics", "Quantum mechanics"));

    school.stream()
        .filter(s -> s.getGpa() > 3.0)
        .map(s -> s.getName())
        .forEach(s -> System.out.println(s));

    System.out.println("-----------------------");
    school.stream()
        .filter(s -> s.getGpa() > 3.0)
        .flatMap(s -> s.getCourses().stream())
        .distinct()
        .sorted((s1, s2) -> s2.compareTo(s1))
        .forEach(s -> System.out.println(s));


    System.out.println("-----------------------");
    school.stream()
        .collect(Collectors.groupingBy(s -> getLetterGrade(s), Collectors.counting()))
        .entrySet()
//        .forEach(e -> System.out.println("These students" + e.getValue() + " got grade " + e.getKey()));
        .forEach(e -> System.out.println(e.getValue() + " students got grade " + e.getKey()));

  }
}
