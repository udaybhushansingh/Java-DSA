
//instance variable → belongs to each OBJECT
//static variable   → belongs to the CLASS


public class Oops_package {
    static void main(String[] args) {
        class Student {
            int rollNo;
            static String university = "Galgotias";
        }

        Student s1 = new Student();
        Student s2 = new Student();
        Student.university = "IIT";

        System.out.println(s1.university); // IIT
        System.out.println(s2.university); // IIT
        System.out.println(Student.university); // IIT]

        class Student2 {
            static String university = "Galgotias";

            static void displayUniversity() {
                System.out.println(university);
            }
        }
        Student2.displayUniversity();

    }

}
