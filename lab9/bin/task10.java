class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showPrice() {
        System.out.println(name + ": " + price + " тг");
    }
}

class Food extends Product {
    Food(String name, double price) {
        super(name, price);
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }
}

class Clothes extends Product {
    Clothes(String name, double price) {
        super(name, price);
    }
}

public class task10 {
    public static void main(String[] args) {
        Food food = new Food("Хлеб", 250);
        Electronics electronics = new Electronics("Телефон", 180000);
        Clothes clothes = new Clothes("Куртка", 25000);

        food.showPrice();
        electronics.showPrice();
        clothes.showPrice();
    }
}