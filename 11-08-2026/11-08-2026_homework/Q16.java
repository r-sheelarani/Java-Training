class Q16Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Q16Dog extends Q16Animal {
    @Override
    void sound() {
        System.out.println("Dog Sound");
    }
}

public class Q16 {
    public static void main(String[] args) {

        Q16Animal a = new Q16Dog();

        a.sound();
    }
}