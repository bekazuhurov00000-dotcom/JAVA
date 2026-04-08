class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " движется со скоростью " + speed + " км/ч");
    }
}

class Car extends Transport {
    Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " едет по дороге");
    }
}

class Train extends Transport {
    Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " движется по рельсам");
    }
}

class Airplane extends Transport {
    Airplane(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " летит по воздуху");
    }
}

public class task1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180);
        Train train = new Train("Talgo", 140);
        Airplane airplane = new Airplane("Boeing", 900);

        car.move();
        train.move();
        airplane.move();
    }
}