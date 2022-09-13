package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExercises {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        List<String> colors2 = Arrays.asList("white", "black", "red", "green", "blue");
        List<String> colors3 = Arrays.asList("yellow", "black", "red", "green", "blue");



        printList(colors);

//        update("black", "updateBlack", colors);
//        printList(colors);

        extractPart(1, 4, colors);
        System.out.println(areTheSame(colors, colors2));
        System.out.println(areTheSame(colors, colors3));


    }
//    ---------------------------------------------------------------------

    private static void printList(List<String> colors) {
        for (String color : colors) {
            System.out.print(" " + color + " ");
        }
        System.out.println();
    }

//        ------------------------------------------------------------------

    //        update specific array element by given element.
    static void update(String oldValue, String newValue, List<String> list) {
        for (String value : list) {
            if (value.equals(oldValue)) {
                list.set(list.indexOf(value), newValue);
            }
        }
    }

    //extract a portion of a array list
    static void extractPart(int start, int end, List<String> list) {
        System.out.println(list.subList(start, end));
    }
    //compare two array lists
    static boolean areTheSame(List<String> list1, List<String> list2){
        return list1.equals(list2);
    }

}
