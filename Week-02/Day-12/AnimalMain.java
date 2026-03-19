interface Animal {
    public void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog bark.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meow.");
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
