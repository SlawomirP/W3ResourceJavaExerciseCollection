package arrayList.ex1;

//Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        for(String color: colors){
            System.out.println(color);
        }
    }
}
