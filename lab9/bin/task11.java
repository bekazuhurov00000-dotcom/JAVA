class TeamMember {
    String name;

    TeamMember(String name) {
        this.name = name;
    }
}

class Player extends TeamMember {
    Player(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " играет");
    }
}

class Coach extends TeamMember {
    Coach(String name) {
        super(name);
    }

    void train() {
        System.out.println(name + " тренирует команду");
    }
}

class Doctor extends TeamMember {
    Doctor(String name) {
        super(name);
    }

    void heal() {
        System.out.println(name + " лечит игроков");
    }
}

public class task11 {
    public static void main(String[] args) {
        Player player = new Player("Арман");
        Coach coach = new Coach("Серик");
        Doctor doctor = new Doctor("Данияр");

        player.play();
        coach.train();
        doctor.heal();
    }
}