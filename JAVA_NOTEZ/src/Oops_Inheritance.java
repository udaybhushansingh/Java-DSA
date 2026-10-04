 public class Oops_Inheritance {
     /*void main(String[] args) {

         bird b = new bird();
         Arithmetic a = new Arithmetic();
         a.add(10, 20);
         b.fly();
         b.sing();
         b.walk();

     }
     class Animal{
         void walk (){
             System.out.println("i am walking ");
         }

     }
     class bird extends Animal{
         void fly(){
             System.out.println("im flying ");
         }
         void sing(){
             System.out.println("I am singing");
         }


     }

     class Arithmetic {
                 int add(int a, int b) {
             return a + b;
     }


     class Adder extends Arithmetic {

     }
 }*/

     void main(String[] args) {

         Animal a = new Animal();
         Dog d = new Dog();

         d.sound();
         a.sound();


     }

     class Animal {
         void sound() {
             System.out.println("Animal makes a sound");
         }
     }

     class Dog extends Animal {
         @Override
         void sound() {
             super.sound();
             System.out.println("Dog barks");
         }

     }
 }
