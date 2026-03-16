class Student {
    private String name;
    private int age;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getMarks() {
        return this.marks;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vipul");
        s.setAge(23);
        s.setMarks(99);
        System.out.println("Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
        System.out.println("Marks : " + s.getMarks());
    }
}
