package MapExercises;

import Lists.Angajat;
import Lists.Person;
import Lists.Somer;
import Lists.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Ion");
        Person p2 = new Person("Maria");
        Person p3 = new Person("Gheorghe");

        Hobby swim = new Hobby("swim");
        Hobby sing = new Hobby("dance");
        Hobby football = new Hobby("football");
        Hobby dance = new Hobby("dance");

        List<Hobby> p1HobbiesList = new ArrayList<>();
        p1HobbiesList.add(dance);
        p1HobbiesList.add(football);

        List<Hobby> p2HobbiesList = new ArrayList<>();
        p2HobbiesList.add(dance);
        p2HobbiesList.add(sing);

        Map<Person, List<Hobby>> personListMap = new HashMap<>();
        personListMap.put(p1, p1HobbiesList);
        personListMap.put(p2, p2HobbiesList);

        for(Map.Entry<Person, List<Hobby>> personListEntry : personListMap.entrySet()){
            String name = personListEntry.getKey().getName();
            System.out.println("Persona: " + name + " are urmatoarele hobby-uri: ");
            for(Hobby hobby : personListEntry.getValue()){
                System.out.println(hobby.getName());
            }
        }

    }
}