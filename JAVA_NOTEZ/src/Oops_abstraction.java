public class Oops_abstraction {
    static void main(String[] args) {

        circle c = new circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();

    }
}

    abstract class Shape {
        abstract void area();
    }

    class circle extends Shape {
        int radius= 5 ;
        @Override
        void area(){
            System.out.println("radius " + 3.14 * radius * radius);
        }
    }

    class Rectangle extends Shape {

        int length = 10;
        int width = 5;

        @Override
        void area() {
            System.out.println("Rectangle area: " + length * width);
        }
    }