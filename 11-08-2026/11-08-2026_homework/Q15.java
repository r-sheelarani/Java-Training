class Q15Animal {
    void eat() {
        System.out.println("Animal eats.");
    }

    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Q15Dog extends Q15Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    void run() {
        System.out.println("Dog runs.");
    }

    void fetch() {
        System.out.println("Dog fetches the ball.");
    }
}

public class Q15 {
    public static void main(String[] args) {

        // Create Dog object
        Q15Dog dog = new Q15Dog();

        // Upcasting
        Q15Animal animal = dog;

        animal.eat();
        animal.sound();

        // Downcasting
        Q15Dog d = (Q15Dog) animal;

        d.run();
        d.fetch();
    }
}