abstract class UniversityStudent {
    int studentId;
    String name;
    String department;

    UniversityStudent(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    abstract double calculateFees();

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Fees: " + calculateFees());
    }
}

interface AssignmentSubmitter {
    void submitAssignment();
}

class RegularUniversityStudent extends UniversityStudent implements AssignmentSubmitter {
    RegularUniversityStudent(int id, String name, String department) {
        super(id, name, department);
    }

    @Override
    double calculateFees() {
        return 50000;
    }

    public void submitAssignment() {
        System.out.println("Regular student submitted assignment.");
    }
}

class DistanceUniversityStudent extends UniversityStudent implements AssignmentSubmitter {
    DistanceUniversityStudent(int id, String name, String department) {
        super(id, name, department);
    }

    @Override
    double calculateFees() {
        return 30000;
    }

    public void submitAssignment() {
        System.out.println("Distance student submitted assignment.");
    }
}

class ResearchUniversityStudent extends UniversityStudent {
    ResearchUniversityStudent(int id, String name, String department) {
        super(id, name, department);
    }

    @Override
    double calculateFees() {
        return 40000;
    }
}

public class UniversityExamDemo {
    public static void main(String[] args) {
        UniversityStudent s;

        s = new RegularUniversityStudent(101, "Priya", "Biomedical");
        s.display();
        ((AssignmentSubmitter) s).submitAssignment();

        System.out.println();

        s = new DistanceUniversityStudent(102, "Arun", "Computer Science");
        s.display();
        ((AssignmentSubmitter) s).submitAssignment();

        System.out.println();

        s = new ResearchUniversityStudent(103, "Rahul", "ECE");
        s.display();
    }
}