class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println(name + " атакует");
    }
}

class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " атакует мечом");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " атакует магией");
    }
}

class Archer extends Character {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " стреляет из лука");
    }
}

public class task14 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Танк");
        Mage mage = new Mage("Маг");
        Archer archer = new Archer("Лучник");

        warrior.attack();
        mage.attack();
        archer.attack();
    }
}