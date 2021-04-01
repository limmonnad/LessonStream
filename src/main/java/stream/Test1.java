package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//          list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);

        int[] array = {5, 9, 3, 8, 11, 12, 99};

//нацело делится на 3 тогда делим на 3

        int[] ints = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println("ints = " + Arrays.toString(ints));



        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");

        System.out.println("set = " + set);

        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());


        System.out.println("list3 = " + list3);
    }



}
