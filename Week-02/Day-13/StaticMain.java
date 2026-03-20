class Student {
    static int count = 0;

    Student() {
        count++;
        System.out.println("Object created. Total objects : " + count);
    }
}

public class StaticMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
    }
}
