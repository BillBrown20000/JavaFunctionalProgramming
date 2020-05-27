package streams;


import com.sun.tools.javac.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Bill", Gender.MALE),
                new Person("Daisy", Gender.FEMALE),
                new Person("Mark", Gender.MALE),
                new Person("Mariah",Gender.FEMALE),
                new Person("Luigi", Gender.MALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY)
        );

//            people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out :: println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);

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
        MALE, FEMALE, PREFER_NOT_TO_SAY
        }
}
