import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Andersen {
    // есть класс персон у него есть поле Чилдрен и у него Лист детей
    // в каждом ребенке есть возраст
    // нам дан список всех персонов
    // из списка Персон получить список всех детей которым больше 18 с помощью стрима


    public static void main(String[] args) {
//        Person person = new Person("Kris");
//        person.addChild();
//
//        List<Person> personList = new ArrayList<>();
//        personList.add(person);
//
//
//        List<Children> ch = personList.stream().flatMap(person1 -> person1.children.stream().
//                filter(children -> children.name.equals("Anton"))
//        ).collect(Collectors.toList());
//

        Arrays.stream(new Integer[]{4, 1, 3})
                .map(e -> {
                    System.out.println("Saw " + e);
                    return e;
                }).sorted()
                .map(e -> {
                    System.out.println("Saw2 " + e);
                    return e;
                })
                .anyMatch(i -> i == 3);


        // просто из Персона список детей
//        person.children.stream()
//                .filter(children -> children.age > 17)
//                .forEach(children ->
//                        System.out.println(children.age));
    }

    public static class Person {
        List<Children> children = new ArrayList<>();

        String name;

        Person(String name) {
            this.name = name;
        }

        void addChild() {
            children.add(new Children("Kris"));
            children.add(new Children("Kris"));
            children.add(new Children("Kris"));
            children.add(new Children("Kris"));
            children.add(new Children("Anton"));
        }
    }

    public static class Children {
        String name;

        Children(String name) {
            this.name = name;
        }
    }

}
