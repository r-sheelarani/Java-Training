class Q17Animal {
}

class Q17Dog extends Q17Animal {
    void bark() {
        System.out.println("Bark");
    }
}

public class Q17 {
    public static void main(String[] args) {

        Q17Animal a = new Q17Animal();

        if (a instanceof Q17Dog) {
            Q17Dog d = (Q17Dog) a;
            d.bark();
        } else {
            System.out.println("Object is not a Dog.");
        }
    }
}