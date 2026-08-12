interface Q18A {
    void display();
}

interface Q18B {
    void display();
}

class Q18C implements Q18A, Q18B {

    @Override
    public void display() {
        System.out.println("Display method implemented in C.");
    }
}

public class Q18 {
    public static void main(String[] args) {

        Q18C c = new Q18C();
        c.display();
    }
}