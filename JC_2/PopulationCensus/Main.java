package JC_2.PopulationCensus;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        long minors = persons.stream()
                .filter(age -> age.getAge() < 18)
                .count();
        System.out.println("1.Количество несовершеннолетних (т.е. людей младше 18 лет): " + minors + "\n");

        List<String> personsOfMilitaryAge = persons.stream()
                .filter(age -> age.getAge() > 17 && age.getAge() < 28)
                .filter(sex -> sex.getSex() == Sex.MAN)
                .map(Person::toString).toList();
        System.out.println("2.Список фамилий лиц мужского пола призывного возраста (18-27 лет):\n");
        personsOfMilitaryAge.forEach(System.out::println);

        List<String> workingPopulation = persons.stream()
                .filter((p) -> (p.getAge() > 17 && p.getAge() < 65) && (p.getSex() == Sex.MAN)
                        || (p.getAge() > 17 && p.getAge() < 60) && (p.getSex() == Sex.WOMEN))
                .filter(e -> e.getEducation() == Education.HIGHER)
                .sorted(Comparator.comparing(Person::getFamily))
                .map(Person::toString).toList();
        System.out.println("\n3.Список фамилий лиц трудоспособного возраста:\n");
        workingPopulation.forEach(System.out::println);
    }
}
