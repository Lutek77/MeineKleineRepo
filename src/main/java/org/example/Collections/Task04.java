package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main04 {

    public static void main(String[] args) {

/*        List<City> cities = Main03.initialize();
        System.out.println("cities = " + cities);

        List<City> reverseCities = reverse(cities);
        System.out.println("reverseCities = " + reverseCities);*/

        List<City> cities = new ArrayList<>();
        cities.add(new City("Warszawa", 1000));
        cities.add(new City("Iława", 500));

        System.out.println(cities);

        System.out.println(reverse(cities));


    }

    public static List<City> reverse (List<City> meineList ){
        List<City> revCities =new ArrayList<>();
        ListIterator<City> iterator =  meineList.listIterator(meineList.size());

        while (iterator.hasPrevious()) {
            City c = iterator.previous();
            revCities.add(c);

        }
        return  revCities ;
    }




}
