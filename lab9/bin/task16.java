class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Марка: " + brand + ", Скорость: " + speed + " км/ч");
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Расход топлива Sedan: 7 л/100км");
    }
}

class Truck extends Car {
    Truck(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Расход топлива Truck: 20 л/100км");
    }
}

class SUV extends Car {
    SUV(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Расход топлива SUV: 10 л/100км");
    }
}

public class task16 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", 180);
        Truck truck = new Truck("Volvo", 120);
        SUV suv = new SUV("BMW", 200);

        sedan.displayInfo();
        sedan.fuelConsumption();

        truck.displayInfo();
        truck.fuelConsumption();

        suv.displayInfo();
        suv.fuelConsumption();
    }
}