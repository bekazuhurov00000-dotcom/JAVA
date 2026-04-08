class Vehicle {
    void startEngine() {
        System.out.println("Двигатель запускается");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Мотоцикл заводится");
    }
}

class Bus extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Автобус запускает двигатель");
    }
}

class Taxi extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Такси готово к поездке");
    }
}

public class task8 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bike.startEngine();
        bus.startEngine();
        taxi.startEngine();
    }
}