class Employee {
    private String name;
    private double salary;
    private String department;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Vipul");
        e.setSalary(10000.00);
        e.setDepartment("Backend");
        System.out.println("Name : " + e.getName());
        System.out.println("Salary : " + e.getSalary());
        System.out.println("Department : " + e.getDepartment());
    }
}
