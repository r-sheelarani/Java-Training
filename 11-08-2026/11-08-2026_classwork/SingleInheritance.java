class SingleInheritance {
    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends SingleInheritance {
    void show() {
        System.out.println("This is the child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();

        obj.display();
        obj.show();
    }
}