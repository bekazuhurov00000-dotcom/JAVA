class Component {
    String name;

    Component(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Компонент: " + name);
    }
}

class CPU extends Component {
    CPU(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Процессор: " + name);
    }
}

class RAM extends Component {
    RAM(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Оперативная память: " + name);
    }
}

class GPU extends Component {
    GPU(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Видеокарта: " + name);
    }
}

public class task9 {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i7");
        RAM ram = new RAM("16 GB DDR4");
        GPU gpu = new GPU("NVIDIA RTX 4060");

        cpu.showInfo();
        ram.showInfo();
        gpu.showInfo();
    }
}