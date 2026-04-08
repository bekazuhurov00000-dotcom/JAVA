class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " выполняет работу");
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " управляет командой");
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " пишет код");
    }
}

class Designer extends Employee {
    Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " разрабатывает дизайн");
    }
}

public class task3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Али", 300000);
        Developer developer = new Developer("Иван", 250000);
        Designer designer = new Designer("Алина", 220000);

        manager.work();
        developer.work();
        designer.work();
    }
}