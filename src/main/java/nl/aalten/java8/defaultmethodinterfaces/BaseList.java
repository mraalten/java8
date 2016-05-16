package nl.aalten.java8.defaultmethodinterfaces;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class BaseList implements List {
    private java.util.List javaList = new java.util.ArrayList();

    @Override
    public void add(Object objectToAdd) {
        if (objectToAdd != null) {
            javaList.add(objectToAdd);
        }
    }

    @Override
    public boolean delete(Object objectToDelete) {
        if (objectToDelete != null) {
            return javaList.remove(objectToDelete);
        }
        return false;
    }
}
