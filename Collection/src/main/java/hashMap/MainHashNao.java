package hashMap;

import java.util.HashMap;

public class MainHashNao {
    public static void main(String[] args) {

        HashMap<Integer, String> persons = new HashMap<>();

        persons.put(1, "Bob");
        persons.put(2, "Merry");
        persons.put(3, "Hannah");
        persons.put(4, "Terry");
        persons.put(5, "Lilly");

//        count the number of key-value (size) mappings in a map.
        System.out.println("1. size -> " + persons.size());

//        copy all of the mappings from the specified map to another map.

        HashMap<Integer, String> copyPersons = new HashMap<>();

        copyPersons.putAll(persons);
        System.out.println("size copyPersons -> " + copyPersons.size());

//        check whether a map contains key-value mappings (empty) or not
        System.out.println("-> " + persons.isEmpty());


    }
}
