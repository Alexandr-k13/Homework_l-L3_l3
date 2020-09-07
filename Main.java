package geekbrains;

import java.util.*;

import geekbrains.Phonebook;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"Mercedes", "Ford", "Skoda", "Ford", "Kia", "Mercedes", "Lada", "Niva", "Kia", "Mazda", "Reno"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : cars) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);
    }
}

    Phonebook phonebook = new Phonebook();
                phonebook.add("Alex", "485759", );
                phonebook.add("Nikita", "7582466");
                phonebook.add("Sveta", "75655813",);

                System.out.println( phonebook.getPhone("Alex"));
                System.out.println( phonebook.getPhone("Nikita"));
                System.out.println(phonebook.getPhones("Sveta"));
                }
             }
