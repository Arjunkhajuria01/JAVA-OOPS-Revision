// Create a base class Animal with a method sound().
// Inherit classes Dog and Cat that override the method with their own sounds.
class Animal{
    public void sound(){
        System.out.println("shushhhh");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("bhau bhau");
    }

        }

class Cat extends Animal{
    public void sound(){
        System.out.println("Meow Meow");
    }
}



public class Q3_Revision {
    public static void main(String[] args) {
    Animal an = new Animal();
    Cat ct = new Cat();

    ct.sound();
    }
}
