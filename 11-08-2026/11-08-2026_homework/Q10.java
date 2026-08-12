class Q10Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Q10Dog extends Q10Animal {
    void run() {
        System.out.println("Dog runs.");
    }
}

public class Q10 {
    public static void main(String[] args) {

        Q10Animal a = new Q10Dog();

        if (a instanceof Q10Dog) {
            Q10Dog d = (Q10Dog) a;
            d.run();
        }
    }
}