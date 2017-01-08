package io.github.nma.controllers;

import io.github.nma.WardrobeTestModule;
import io.github.nma.dao.DrawerDao;
import io.github.nma.dao.StackDao;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;
import io.github.nma.dao.ShelfDao;
import io.github.nma.dao.ShelfToStackDao;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
@Guice(modules = WardrobeTestModule.class)
public class MainControllerTest {

    @Inject
    StackDao stackDao;

    @Inject
    ShelfDao shelfDao;

    @Inject
    DrawerDao drawerDao;

    @Inject
    ShelfToStackDao shelfBelongsToStackDao;

    @Inject
    MainController controller;

    @Test
    public void testShowListShelves() {

    }

    @Test
    public void testShowListOfStacks() {

    }

    @Test
    public void testStacksHasShelves() {

    }
}
