package com.javagda25.Comparator_z4;

// Stwórz aplikację a w niej klasę Customer. Każdy Customer ma pola:
//  - wiek (int)
//  - w ciąży (boolean)
//  - nazwa/imie
//
// Stwórz klasę apteka a w niej kolejkę klientów. Dodawaj klientów do kolejki i sortuj je następująco:
// - osoby starsze powinny pójść możliwie na przód kolejki jeśli mają powyżej 60 lat, jeśli nie ustawiają się normalnie na koniec
// - osoby w ciąży mają priorytet nad wszystkimi
// (stwórz metody do sprawdzania kolejki - wypisywania wszystkich w kolejce)
// (użyj comparator i comparable)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Apteka {
    public static void main(String[] args) {
        List<Customer> kolejka = new ArrayList<>();
        kolejka.add(new Customer("Joanna", 15, false));
        kolejka.add(new Customer("Zdzisław", 75, false));
        kolejka.add(new Customer("Zuzanna", 34, true));
        kolejka.add(new Customer("Anna", 24, true));
        kolejka.add(new Customer("Kamil", 62, false));
        kolejka.add(new Customer("Kamila", 30, false));
        kolejka.add(new Customer("Bartek", 45, false));
        kolejka.add(new Customer("Irena", 61, false));

        Collections.sort(kolejka);

        System.out.println(kolejka);
        Collections.sort(kolejka, new CustomerComparator());
        System.out.println(kolejka);

    }
}
