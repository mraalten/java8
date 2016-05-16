package nl.aalten.java8.defaultmethodinterfaces;

public class ExtendedList implements List {
    private java.util.List javaList = new java.util.ArrayList();

    @Override
    public void add(Object objectToAdd) {
        javaList.add(objectToAdd);
    }

    @Override
    public boolean delete(Object objectToDelete) {
        return javaList.remove(objectToDelete);
    }

    @Override
    public int size() {
        return javaList.size();
    }
}
