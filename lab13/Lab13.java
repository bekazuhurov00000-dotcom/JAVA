package lab13;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Lab13 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println("Sum: " + sum.apply(5, 3));

        Function<String, String> toUpper = String::toUpperCase;
        System.out.println(toUpper.apply("hello"));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Max: " + max);

        List<String> words = Arrays.asList("java", "stream", "api", "lambda");

        words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        Function<String, String> capitalize =
                s -> Character.toUpperCase(s.charAt(0)) + s.substring(1);

        System.out.println(capitalize.apply("java"));

        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        numbers.forEach(System.out::println);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        System.out.println("Min: " + min.orElse(0));

        Consumer<String> printer = System.out::println;
        printer.accept("Hello Consumer");

        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println("Random: " + randomSupplier.get());

        List<Student> students = getStudents();

        students.stream()
                .sorted(Comparator.comparingInt(s -> s.age))
                .forEach(System.out::println);

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);

        int total = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + total);

        Arrays.asList(1,2,2,3,3,4,5).stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        List<Order> orders = Arrays.asList(
                new Order(500),
                new Order(1500),
                new Order(2500)
        );

        orders.stream()
                .filter(o -> o.price > 1000)
                .sorted(Comparator.comparingInt(o -> o.price))
                .forEach(System.out::println);
    }

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + grade;
        }
    }

    static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Ali", 20, 85),
                new Student("Dana", 22, 75),
                new Student("Oleg", 20, 90),
                new Student("Sara", 21, 88)
        );
    }

    static class Order {
        int price;

        Order(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Order: " + price;
        }
    }
}