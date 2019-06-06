package com.javagda25.Comparator_z4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Customer implements Comparable<Customer> {
    private String imie;
    private int wiek;
    private boolean wCiazy;

    public int compareTo(Customer o) {
        if (this.wiek < 60) {
            return 1;
        } else if (this.wiek > 60 && this.wiek > o.wiek) {
            return -1;
        }
        return 0;
    }
}
