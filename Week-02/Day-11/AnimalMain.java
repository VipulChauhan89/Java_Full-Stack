class Animal {
    public void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meow");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
    }
}
