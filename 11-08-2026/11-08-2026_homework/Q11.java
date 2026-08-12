class Q11Employee {
    String name;
    double salary;

    Q11Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Q11Developer extends Q11Employee {
    String programmingLanguage;

    Q11Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
}

class Q11SeniorDeveloper extends Q11Developer {
    int experience;

    Q11SeniorDeveloper(String name, double salary,
                       String programmingLanguage, int experience) {
        super(name, salary, programmingLanguage);
        this.experience = experience;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Experience: " + experience + " years");
    }
}

public class Q11 {
    public static void main(String[] args) {

        Q11SeniorDeveloper s =
                new Q11SeniorDeveloper("Arun", 60000, "Java", 5);

        s.display();
    }
}