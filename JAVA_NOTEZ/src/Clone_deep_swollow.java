public class Clone_deep_swollow {
    public static void main(String[] args) {

        Student original = new Student("Uday", new Address("Delhi"));

        Student Shallow = original.shallowCopy();

        System.out.println("Shallow Copy:");
        System.out.println("Original: " + original.name + " " + original.address.city);
        System.out.println("Copy: " + Shallow.name + " " + Shallow.address.city);

        original.address.city = "Delhi";

        Student deep = original.deepCopy();

        deep.address.city = "Mumbai";

        System.out.println("\nDeep Copy:");
        System.out.println("Original: " + original.name + " " + original.address.city);
        System.out.println("Copy: " + deep.name + " " + deep.address.city);

    }


    static class Address {
        String city;

        Address(String city) {
            this.city = city;
        }
    }

    static class Student {
        String name;
        Address address;

        Student(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        Student shallowCopy() {
            return new Student(this.name, this.address);
        }
        Student deepCopy(){
            Address newAddress = new Address(this.address.city);
            return new Student(this.name, newAddress);
        }


    }
}


