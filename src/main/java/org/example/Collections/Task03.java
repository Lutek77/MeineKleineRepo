package org.example.Collections;

import java.util.ArrayList;
import java.util.List;

public class Task03 {


    public static void main(String[] args) {

        // 1
        List<City> cities = initialize();
        System.out.println("cities = " + cities);

        // 2
        System.out.println("firstSubList = " + firstSubList(cities, 0, 2));

        // 3
        System.out.println("secondSubList = " + secondSubList(cities, 0, 2));


    }

    // 1
    public static List<City> initialize() {

        List<City> CitiesList = new ArrayList<>();

        CitiesList.add(new City("City01", 10000));
        CitiesList.add(new City("City02", 5555));
        CitiesList.add(new City("City03", 3333));
        CitiesList.add(new City("City04", 222));
        CitiesList.add(new City("City05", 11));

        return CitiesList;


    }

    // 2
    public static List<City> firstSubList(List<City> oList, int start, int end) {

        List<City> newOne = new ArrayList<>();

        for (int i = start; i < end; i++) {
            newOne.add(oList.get(i));
        }

        return newOne;


    }

    // 3
    public static List<City> secondSubList(List<City> oList, int start, int end) {

        return oList.subList(start, end);

    }

}
