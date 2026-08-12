abstract class CompanyEmployee {
    int employeeId;
    String employeeName;
    double basicSalary;

    CompanyEmployee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println();
    }
}

class CompanyDeveloper extends CompanyEmployee {
    CompanyDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 10000;
    }
}

class CompanyTester extends CompanyEmployee {
    CompanyTester(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 5000;
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        CompanyEmployee e;

        e = new CompanyDeveloper(101, "Arun", 40000);
        e.display();

        e = new CompanyTester(102, "Priya", 35000);
        e.display();
    }
}