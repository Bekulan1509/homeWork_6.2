package com.company;

public class Name implements Comparable <Name> {
    private String name;



    public String getName() {
        return name;
    }

    public Name(String name) {
        this.name = name;
    }

    public String toArray() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        return this.name.compareTo(o.getName());
    }
}
