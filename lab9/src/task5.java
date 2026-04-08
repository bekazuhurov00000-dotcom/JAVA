class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void study() {
        System.out.println(name + " учится");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    void teach() {
        System.out.println(name + " преподает");
    }
}

class Administrator extends Person {
    Administrator(String name) {
        super(name);
    }

    void manage() {
        System.out.println(name + " управляет учебным процессом");
    }
}

public class task5 {
    public static void main(String[] args) {
        Student student = new Student("Марат");
        Teacher teacher = new Teacher("Светлана");
        Administrator admin = new Administrator("Ержан");

        student.study();
        teacher.teach();
        admin.manage();
    }
}