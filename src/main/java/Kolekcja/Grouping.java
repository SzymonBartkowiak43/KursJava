package Kolekcja;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void run(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 33, 1.75));
        people.add(new Person("Mariusz", 29, 1.95));
        people.add(new Person("Dominik", 37, 1.66));

//        Map<Integer, List<Person>> collect = people.stream()
//                .collect(Collectors.groupingBy(Person::getAge));
//
//        System.out.println(collect);
        List<String> teams = new ArrayList<>();

        teams.add("Poland");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");
        teams.add("Sweden");

        Map<Integer, List<String>> collect = teams.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

        Map<Boolean, List<String>> s = teams.stream()
                .collect(Collectors.partitioningBy(team -> team.startsWith("S")));

        System.out.println(s);

    }
}
