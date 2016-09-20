package com.nma.wardrobe.dao;

import java.util.Calendar;
import java.util.UUID;

import io.swagger.model.Drawer;
import io.swagger.model.Shelf;
import io.swagger.model.Stack;

/**
 * Creates a bundle of objects for testing;
 *
 * @author Nick Ma (nick.ma@maluuba.com)
 */
public class TestFactory {
    public static Stack createStack(String stackName) {
        Stack stack = new Stack();
        stack.setId(UUID.randomUUID().toString());
        stack.setName("test-stack");

        return stack;
    }

    public static Shelf createShelf(String serviceName) {
        Shelf shelf = new Shelf();
        shelf.setId(UUID.randomUUID().toString());
        shelf.setName(serviceName);

        return shelf;
    }

    public static Drawer createDrawer(String serviceName) {
        Drawer drawer = new Drawer();
        drawer.setId(UUID.randomUUID().toString());
        drawer.setDateAdded(Calendar.getInstance().getTime());

        return drawer;
    }
}
