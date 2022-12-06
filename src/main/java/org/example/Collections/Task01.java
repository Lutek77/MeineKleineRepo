package org.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        // 1
        List<Integer> elements = new ArrayList<>();
        // 2
        for (int i = 10; i < 20 ; i++) {

            elements.add(i);

        }
        // 3
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));

        }

        // 4
        Iterator<Integer> it = elements.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // 5 - nie robić - na upartego można, ale to głupota

        // 6
        for (Integer element : elements) {
            System.out.println(element);
        }


    }
}
