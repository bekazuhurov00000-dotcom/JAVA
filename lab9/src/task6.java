class Device {
    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " включается");
    }
}

class Laptop extends Device {
    Laptop(String brand, int power) {
        super(brand, power);
    }
}

class Smartphone extends Device {
    Smartphone(String brand, int power) {
        super(brand, power);
    }
}

class Tablet extends Device {
    Tablet(String brand, int power) {
        super(brand, power);
    }
}

public class task6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 65);
        Smartphone smartphone = new Smartphone("Samsung", 25);
        Tablet tablet = new Tablet("Apple", 30);

        laptop.turnOn();
        smartphone.turnOn();
        tablet.turnOn();
    }
}