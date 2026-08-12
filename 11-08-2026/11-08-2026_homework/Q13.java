class Q13Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Q13Dog extends Q13Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Q13Cat extends Q13Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Q13 {
    public static void main(String[] args) {

        Q13Animal a;

        a = new Q13Dog();
        a.sound();

        a = new Q13Cat();
        a.sound();
    }
}