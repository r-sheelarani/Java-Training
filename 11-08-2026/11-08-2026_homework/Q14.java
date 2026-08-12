class Q14Employee {
    double basicSalary;

    Q14Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class Q14Developer extends Q14Employee {
    double developerBonus;

    Q14Developer(double basicSalary, double developerBonus) {
        super(basicSalary);
        this.developerBonus = developerBonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + developerBonus;
    }
}

class Q14Tester extends Q14Employee {
    double testingAllowance;

    Q14Tester(double basicSalary, double testingAllowance) {
        super(basicSalary);
        this.testingAllowance = testingAllowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + testingAllowance;
    }
}

public class Q14 {
    public static void main(String[] args) {

        Q14Employee e;

        e = new Q14Developer(40000, 10000);
        System.out.println("Developer Salary: " + e.calculateSalary());

        e = new Q14Tester(35000, 5000);
        System.out.println("Tester Salary: " + e.calculateSalary());
    }
}