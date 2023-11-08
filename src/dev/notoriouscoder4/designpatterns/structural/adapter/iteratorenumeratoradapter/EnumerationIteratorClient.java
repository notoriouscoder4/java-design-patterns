package dev.notoriouscoder4.designpatterns.structural.adapter.iteratorenumeratoradapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorClient {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));
        Enumeration<String> enumeration = v.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
