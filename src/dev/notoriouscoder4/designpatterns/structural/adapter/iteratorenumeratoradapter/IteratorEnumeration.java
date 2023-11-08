package dev.notoriouscoder4.designpatterns.structural.adapter.iteratorenumeratoradapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
