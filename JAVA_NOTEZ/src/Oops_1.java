public class Oops_1 {

    public static void main(String[] args) {

        class Student {
            int marks;
            int rollNo;
            String name;
        }

        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Uday";
        s1.marks = 85;

        Student s2 = new Student();

        s2.rollNo = 11;
        s2.name = "Uday";
        s2.marks = 85;

        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.marks);

    }
}