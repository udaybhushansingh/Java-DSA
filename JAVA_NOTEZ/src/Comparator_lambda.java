import java.util.Arrays;

public class Comparator_lambda {
    static void main(String[] args) {

        Student[] students = {
                new Student("Uday", 85, 20),
                new Student("Rahul", 72, 21),
                new Student("Aman", 91, 22),
                new Student("Karan", 78, 23)
        };
        Arrays.sort(students , (a , b ) -> b.marks - a.marks) ;
        Arrays.sort(students , (a , b ) -> b.age - a.age) ;
        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);

            System.out.println(s.age + " " + s.age);
        }
    }


    static class Student {
        String name;
        int marks;
        int age;

        Student(String name, int marks, int age) {
            this.name = name;
            this.marks = marks;
            this.age = age;
        }
    }
}
