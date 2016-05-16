package nl.aalten.java8.defaultmethodinterfaces;

public interface List {

    /**
     * Adds the supplied object to the list
     * @param objectToAdd object to be added to the list
     */
    void add(Object objectToAdd);

    /**
     * Deletes the supplied object
     */
    boolean delete(Object objectToDelete);

    /**
     * Returns the size of the list, if not implemented in returns 0.
     * @return the size or 0 if not implemented
     */
    default int size() {
        return 0;
    }
}
