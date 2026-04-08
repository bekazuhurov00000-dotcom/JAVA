class Instrument {
    void playSound() {
        System.out.println("Инструмент издает звук");
    }
}

class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Гитара играет");
    }
}

class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Пианино играет");
    }
}

class Drums extends Instrument {
    @Override
    void playSound() {
        System.out.println("Барабаны звучат");
    }
}

public class task12 {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drums drums = new Drums();

        guitar.playSound();
        piano.playSound();
        drums.playSound();
    }
}