public class Oops_2 {

    public static void main(String[] args) {

        class Student {

            int marks;
            int rollNo;
            String name;

            // Parameterized constructor
            Student(int rollNo, String name, int marks) {
                this.rollNo = rollNo;
                this.name = name;
                this.marks = marks;
            }

            // Constructor chaining
            Student() {
                this(1001, "Uday", 98);
            }

            // Constructor with one parameter
            Student(int rollNo) {
                this.rollNo = rollNo;
            }

            // Display method
            void display() {
                System.out.println(this.rollNo);
                System.out.println(this.name);
                System.out.println(this.marks);
            }
        }

        Student s1 = new Student();
        Student s2 = new Student(102);
        Student s3 = new Student(103, "Rahul", 90);

        s1.display();
        s2.display();
        s3.display();

        Student s = new Student();
        s1 = null;
    }
}