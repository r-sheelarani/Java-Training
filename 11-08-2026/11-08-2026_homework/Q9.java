class Q9Animal {
    void eat() {
        System.out.println("Animal eats.");
    }

    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Q9Dog extends Q9Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    void run() {
        System.out.println("Dog runs.");
    }
}

public class Q9 {
    public static void main(String[] args) {

        Q9Animal a = new Q9Dog();

        a.eat();
        a.sound();

        // a.run();
        // Error: run() is not available through Q9Animal reference.
    }
}