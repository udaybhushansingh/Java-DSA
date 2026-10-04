import java.util.Arrays;

public class Comparable_compareTo {
    static void main(String[] args) {

        Student[] students = {
                new Student("Uday", 85),
                new Student("Rahul", 72),
                new Student("Aman", 91),
                new Student("Karan", 78)
        };

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);
        }
    }


    }
    class Student implements Comparable<Student> {
        String name ;
        int marks ;

        Student(  String name ,int marks ){
            this.name = name ;
            this.marks = marks ;
        }

        @Override
        public int compareTo(Student other){
            return this.marks = marks ;
        }
    }

