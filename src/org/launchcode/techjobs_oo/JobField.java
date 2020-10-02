package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private final int id;
    private static int nextId = 1;
    private String value;


    public JobField(String value) {
        id = nextId;
        nextId++;;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }


}
