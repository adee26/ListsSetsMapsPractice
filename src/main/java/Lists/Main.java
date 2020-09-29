package Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person somer = new Somer("Ion", "tamplar");
        Person angajat = new Angajat("Maria", 2500);
        Person student = new Student("Gheorghe", "Constructii");

        List<Person> persons = new LinkedList<Person>();
        persons.add(somer);
        persons.add(angajat);
        persons.add(student);

        for(Person person : persons ){
            System.out.println(person.getName() + " ");
        }
        System.out.println(persons.indexOf(angajat));
        System.out.println(persons.get(2).getName());
    }
}
