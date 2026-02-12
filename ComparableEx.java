import java.util.*;

public class ComparableEx {

    static class Student implements Comparable<Student> {
        int age;
        String name;

        Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Natural ordering based on age
        public int compareTo(Student s) {
            return this.age - s.age;
        }

        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String args[]) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(22, "Abhilasha"));
        list.add(new Student(19, "Sai"));
        list.add(new Student(25, "Siddu"));
        list.add(new Student(21, "Abhi"));

        Collections.sort(list);   // uses compareTo()

        System.out.println(list);
    }
}