package arrayList.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("black");
        colors.add("white");
        colors.add("green");

        for(String color: colors){
            System.out.println(color);
        }

        colors.add(0, "yellow");
        System.out.println();

        for(String color: colors){
            System.out.println(color);
        }
    }
}
