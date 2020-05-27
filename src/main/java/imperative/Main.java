package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bill",Gender.MALE),
                new Person("Daisy", Gender.FEMALE),
                new Person("Mark", Gender.MALE),
                new Person("Mariah", Gender.FEMALE),
                new Person("Daisy", Gender.MALE)
        );
        //Imperative Apporach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }

        for (Person female : females) {
            System.out.println(female);
            }
        }
        //Declarative approach
        List<Person> female2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        female2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
                    this.name = name;
                    this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }



}