class Course {
    String title;

    Course(String title) {
        this.title = title;
    }

    void startCourse() {
        System.out.println("Курс " + title + " начинается");
    }
}

class ProgrammingCourse extends Course {
    ProgrammingCourse(String title) {
        super(title);
    }
}

class MathCourse extends Course {
    MathCourse(String title) {
        super(title);
    }
}

class HistoryCourse extends Course {
    HistoryCourse(String title) {
        super(title);
    }
}

public class task13 {
    public static void main(String[] args) {
        ProgrammingCourse pc = new ProgrammingCourse("Java");
        MathCourse mc = new MathCourse("Алгебра");
        HistoryCourse hc = new HistoryCourse("История Казахстана");

        pc.startCourse();
        mc.startCourse();
        hc.startCourse();
    }
}