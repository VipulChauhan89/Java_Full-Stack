class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void manage() {
        System.out.println(name + " (Manager) is managing the " + department + " department.");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println(name + " (Developer) is writing code in " + programmingLanguage + ".");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Rahul", 101, 75000.0, "HR");
        Developer dev = new Developer("Ram", 102, 60000.0, "Java");
        System.out.println("--- Manager Details ---");
        mgr.displayInfo();
        mgr.manage();
        System.out.println("--- Developer Details ---");
        dev.displayInfo();
        dev.code();
    }
}
