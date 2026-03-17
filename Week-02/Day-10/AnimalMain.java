class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meowing...");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println("--- Dog ---");
        d.eat();
        d.bark();
        System.out.println("--- Cat ---");
        c.eat();
        c.meow();
    }
}
