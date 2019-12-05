package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("list A:");
        String names = scanner.nextLine();
        String names2 = scanner.nextLine();
        String names3 = scanner.nextLine();
        String names4 = scanner.nextLine();
        String names5 = scanner.nextLine();
        System.out.println("\nlist B:");
        String namesB = scanner.nextLine();
        String namesB2 = scanner.nextLine();
        String namesB3 = scanner.nextLine();
        String namesB4 = scanner.nextLine();
        String namesB5 = scanner.nextLine();


        ArrayList<Name> list = new ArrayList<>();
        list.add(new Name(names));
        list.add(new Name(names2));
        list.add(new Name(names3));
        list.add(new Name(names4));
        list.add(new Name(names5));
        System.out.println("\nlist A:");


        Iterator<Name> iterator = list.iterator();
        while (iterator.hasNext()) {
            Name name = iterator.next();
            System.out.println(name.getName());
        }


        ArrayList<Name> listB = new ArrayList<>();
        listB.add(new Name(namesB));
        listB.add(new Name(namesB2));
        listB.add(new Name(namesB3));
        listB.add(new Name(namesB4));
        listB.add(new Name(namesB5));
        System.out.println("\nlist B:");


        iterator = listB.iterator();
        while (iterator.hasNext()) {
            Name name = iterator.next();
            System.out.println(name.getName());
        }


    }


}

