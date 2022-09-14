package hashSet;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        iterate(set);
        System.out.println("--> " + size(set));

    }

    //Write a Java program to iterate through all elements in a hash list
    public static void iterate(HashSet<String> set){
        set.stream().forEach(System.out::println);
    }

    //Write a Java program to get the number of elements in a hash set.
    public static long size(HashSet<String> set){
        long sizeSet = set.stream()
                .count();
       return sizeSet;
    }
}
