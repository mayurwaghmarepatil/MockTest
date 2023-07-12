class Animal{
    public void makeSound() {
        System.out.println("The animal makes sound");
    }
}
class Dog extends Animal{
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    public void makeSound() {
        System.out.println("cat is quarrel");
    }
}
class Cow extends Animal{
    public void makeSound() {
        System.out.println("cow is mooing");
    }
}
public class Main56 {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.makeSound();
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
        Cow cw=new Cow();
        cw.makeSound();
    }
}
