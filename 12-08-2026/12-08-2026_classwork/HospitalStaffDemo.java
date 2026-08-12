abstract class MedicalStaff {
    String name;
    int employeeId;
    String department;

    MedicalStaff(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    abstract void performDuty();

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        performDuty();
        System.out.println();
    }
}

class MedicalDoctor extends MedicalStaff {
    MedicalDoctor(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    void performDuty() {
        System.out.println("Duty: Treats patients.");
    }
}

class MedicalNurse extends MedicalStaff {
    MedicalNurse(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    void performDuty() {
        System.out.println("Duty: Takes care of patients.");
    }
}

class MedicalPharmacist extends MedicalStaff {
    MedicalPharmacist(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    void performDuty() {
        System.out.println("Duty: Provides medicines.");
    }
}

public class HospitalStaffDemo {
    public static void main(String[] args) {
        MedicalStaff s;

        s = new MedicalDoctor("Arun", 101, "Cardiology");
        s.display();

        s = new MedicalNurse("Priya", 102, "General Ward");
        s.display();

        s = new MedicalPharmacist("Rahul", 103, "Pharmacy");
        s.display();
    }
}