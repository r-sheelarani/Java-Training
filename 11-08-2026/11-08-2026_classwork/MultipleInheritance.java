interface A {
    void displayA();
}

interface B {
    void displayB();
}

class MultipleInheritance implements A, B {
    public void displayA() {
        System.out.println("Interface A");
    }

    public void displayB() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();

        obj.displayA();
        obj.displayB();
    }
}