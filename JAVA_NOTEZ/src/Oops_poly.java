public class Oops_poly {
    static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.sound();
        b.sound();

    }
    static class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }
}
