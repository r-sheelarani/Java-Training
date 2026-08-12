class Q8Person {
    String name;
    int age;

    Q8Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Q8Student extends Q8Person {
    int rollNo;

    Q8Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        super.display();
        System.out.println("Roll No: " + rollNo);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Q8Student s = new Q8Student("Priya", 19, 101);
        s.displayStudent();
    }
}