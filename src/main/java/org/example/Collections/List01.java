package org.example.Collections;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        System.out.println("myList = " + myList);
        System.out.println("myList.size() = " + myList.size());
        int s = 1, e = 20;
        for (int i = 0; i < e; i++) {
            myList.add(s);
            s = s + 1;
        }
        System.out.println("myList = " + myList);
        System.out.println("myList.size() = " + myList.size());
        myList.set(0, 100);
        System.out.println("myList = " + myList);
        System.out.println("indeks pierwszego wystąpienia obiektu" + myList.indexOf(20));
        myList.remove(0);
        System.out.println("myList = " + myList);
        System.out.println("myList size = " + myList.size());
        myList.removeAll(myList);
        System.out.println("myList size = " + myList.size());


    }
}
