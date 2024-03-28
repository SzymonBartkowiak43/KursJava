package Kolekcja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CountingSummingAveraging {
    public static void run() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 33, 1.75));
        people.add(new Person("Mariusz", 29, 1.95));
        people.add(new Person("Dominik", 37, 1.66));

        Long collect = people.stream()
                .collect(counting());

        System.out.println(collect);

        Integer collect1 = people.stream()
                .collect(summingInt(Person::getAge));

        System.out.println(collect1);

        Optional<Integer> collect2 = people.stream()
                .map(Person::getAge)
                .collect(maxBy(Comparator.naturalOrder()));

        System.out.println(collect2);
    }
}
