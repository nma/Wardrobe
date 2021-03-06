package io.github.nma.dao;

import java.util.ArrayList;
import java.util.List;

import io.swagger.model.Shelf;
import io.swagger.model.Stack;

/**
 * Creates a bundle of objects for testing;
 *
 * @author Nick Ma (nickma38@gmail.com)
 */
public class TestFactory {
    public static Stack createStack(String stackName) {
        Stack stack = new Stack();
        stack.setId(stackName.toLowerCase());
        stack.setName(stackName);

        return stack;
    }

    public static List<Shelf> createShelves(int count, String prefix) {
        List<Shelf> shelves = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            shelves.add(createShelf(prefix + "_" + count));
        }
        return shelves;
    }

    public static Shelf createShelf(String serviceName) {
        Shelf shelf = new Shelf();
        shelf.setId(serviceName.toLowerCase());
        shelf.setName(serviceName);

        return shelf;
    }

}
