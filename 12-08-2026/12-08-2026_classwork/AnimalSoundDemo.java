abstract class ZooAnimal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    abstract void sound();
}

class ZooDog extends ZooAnimal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}

class ZooCat extends ZooAnimal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

class ZooCow extends ZooAnimal {
    @Override
    void sound() {
        System.out.println("Cow says: Moo");
    }
}

public class AnimalSoundDemo {
    public static void main(String[] args) {
        ZooAnimal a;

        a = new ZooDog();
        a.eat();
        a.sound();

        a = new ZooCat();
        a.eat();
        a.sound();

        a = new ZooCow();
        a.eat();
        a.sound();
    }
}