package nl.aalten.java8.lambdas;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class Runner {

    public static void main(String[] args) {
        List<String> names = getNames();
        orderNamesOldWay(names);
    }

    private static void orderNamesOldWay(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        names.stream().forEach(name -> System.out.println(name));
    }

    /**
     * Creates a list with names in random order
     * @return a random ordered list of names
     */
    private static List<String> getNames() {
        return Arrays.asList("peter", "anna", "mike", "xenia");
    }


}
