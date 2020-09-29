package Lists;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Person somer = new Somer("Ion", "tamplar");
        Person angajat = new Angajat("Maria", 2500);
        Person student = new Student("Gheorghe", "Constructii");

        Map<String, Person> porecle = new HashMap<>();
        porecle.put("John", somer);
        porecle.put("Marie", angajat);
        porecle.put("Ghita", student);

        for(Map.Entry<String, Person> porecla : porecle.entrySet()){
            System.out.println(porecla.getKey() + " " + porecla.getValue().getName());
        }

        System.out.println(porecle.get("John").getName());


    }
}
