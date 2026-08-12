abstract class LearningCourse {
    int courseId;
    String courseName;
    String instructor;
    double baseFee;

    LearningCourse(int courseId, String courseName, String instructor, double baseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.baseFee = baseFee;
    }

    abstract double calculateFee();

    void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Final Fee: " + calculateFee());
        System.out.println();
    }
}

class ProgrammingCourse extends LearningCourse {
    ProgrammingCourse(int id, String name, String instructor, double fee) {
        super(id, name, instructor, fee);
    }

    @Override
    double calculateFee() {
        return baseFee;
    }
}

class DataScienceCourse extends LearningCourse {
    DataScienceCourse(int id, String name, String instructor, double fee) {
        super(id, name, instructor, fee);
    }

    @Override
    double calculateFee() {
        return baseFee + 2000;
    }
}

class CloudComputingCourse extends LearningCourse {
    CloudComputingCourse(int id, String name, String instructor, double fee) {
        super(id, name, instructor, fee);
    }

    @Override
    double calculateFee() {
        return baseFee + 3000;
    }
}

public class CourseFeeDemo {
    public static void main(String[] args) {
        LearningCourse c;

        c = new ProgrammingCourse(101, "Java", "Arun", 5000);
        c.display();

        c = new DataScienceCourse(102, "Data Science", "Priya", 6000);
        c.display();

        c = new CloudComputingCourse(103, "Cloud", "Rahul", 7000);
        c.display();
    }
}