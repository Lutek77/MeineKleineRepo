package org.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            myList.add((i));

        }
        System.out.println(myList);
        removedDivider(myList, 2);
        // prostszy sposób :
        // myList.remove(num -> num % 3 == 0);
        System.out.println(myList);

    }

    public static void removedDivider (List<Integer> list, int divider ) {

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % divider == 0) {
                list.remove(i);
            }
        }

/*        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % divider == 0) {
                // usuwając usuwamy ostatnio pobrany element (zwrócony przez next).
                it.remove();
            }
        }*/


    }
}
