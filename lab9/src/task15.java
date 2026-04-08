class Appliance {
    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    void operate() {
        System.out.println(brand + " работает");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " охлаждает продукты");
    }
}

class WashingMachine extends Appliance {
    WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " стирает одежду");
    }
}

class Microwave extends Appliance {
    Microwave(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " разогревает еду");
    }
}

public class task15 {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("LG");
        WashingMachine washingMachine = new WashingMachine("Samsung");
        Microwave microwave = new Microwave("Panasonic");

        refrigerator.operate();
        washingMachine.operate();
        microwave.operate();
    }
}