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

        HashSet<String> set2 = new HashSet<>();
        set2.add("six");
        set2.add("seven");
        set2.add("eight");
        set2.add("nine");
        set2.add("ten");


        set.stream()
                .forEach(value -> System.out.println(value));
        System.out.println("--> " + size(set));
//        clearSet(set);
//        iterate(set);
//        System.out.println("---");
//        System.out.println(numberElements(set));
//        System.out.println(isEmpty(set));

//        System.out.println("+++++++++++");
//        set = (HashSet)set2.clone();
//        iterate(set);
//        System.out.println("+++++++++++");

//        convert a hash set to an array.
//        set.toArray();

//        convert a hash set to a List/ArrayList.
        set.toArray();






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

    //Write a Java program to empty an hash set.
    public static void clearSet(HashSet<String> set){
        set.removeAll(set);
    }

    //program to get the number of elements in a hash set
    public static int numberElements(HashSet<String> set){
        return set.size();
    }

    //program to test a hash set is empty or not.
    public static boolean isEmpty(HashSet<String> set){
        return set.isEmpty();
    }
}
