public class Object_Cloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Uday", 85);

        Student s2 = s1.clone();

        s2.marks = 95;

        System.out.println("Original: " + s1.name + " " + s1.marks);
        System.out.println("Clone: " + s2.name + " " + s2.marks);
    }

    static class Student implements Cloneable {

        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public Student clone() throws CloneNotSupportedException {
            return (Student) super.clone();
        }
    }
}