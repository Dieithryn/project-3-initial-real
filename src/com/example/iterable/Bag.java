package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T> {

    private T value;
    ArrayList<T> list = new ArrayList<>();
    public Bag() {

    }

    @Override
    public boolean isEmpty() {

        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(Object item) {

        list.add((T) item);

    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }

    @Override
    public String toString() {
        return "Bag{" +
                "value=" + value +
                ", list=" + list +
                '}';
    }
}
