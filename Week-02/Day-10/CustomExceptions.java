class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String msg) {
        super(msg);
    }
}

class DuplicateStudentException extends Exception {
    public DuplicateStudentException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Student {
    int id;
    String name;
    int age;
    static Student[] students = new Student[5];
    static int count = 0;

    public Student(int id, String name, int age) throws InvalidAgeException {
        validateAge(age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 || age > 100) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
    }

    public static void addStudent(Student s) throws DuplicateStudentException {
        for (int i = 0; i < count; i++) {
            if (students[i].id == s.id) {
                throw new DuplicateStudentException("Duplicate ID: " + s.id);
            }
        }
        students[count++] = s;
    }

    public static Student findStudent(int id) throws StudentNotFoundException {
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Student not found with ID: " + id);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Amit", 20);
            Student s2 = new Student(2, "Ravi", 22);
            Student.addStudent(s1);
            Student.addStudent(s2);
            // Duplicate test
            Student.addStudent(new Student(1, "Sameer", 21));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Student s = Student.findStudent(3);
            System.out.println(s.name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            new Student(3, "Rahul", -5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
